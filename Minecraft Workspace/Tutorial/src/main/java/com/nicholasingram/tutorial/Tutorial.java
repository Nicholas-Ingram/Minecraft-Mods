package com.nicholasingram.tutorial;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nicholasingram.tutorial.blocks.FirstBlock;
import com.nicholasingram.tutorial.blocks.FirstBlockTile;
import com.nicholasingram.tutorial.blocks.ModBlocks;
import com.nicholasingram.tutorial.items.FirstItem;
import com.nicholasingram.tutorial.setup.ClientProxy;
import com.nicholasingram.tutorial.setup.IProxy;
import com.nicholasingram.tutorial.setup.ModSetup;
import com.nicholasingram.tutorial.setup.ServerProxy;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("tutorial")
public class Tutorial
{
	
	// Figures out if the mod is running on client side or server side 
	public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
	
	public static ModSetup setup = new ModSetup();
	
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Tutorial() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
    	setup.init();
    	proxy.init();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
        	event.getRegistry().register(new FirstBlock());
        }
        
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        	Item.Properties properties = new Item.Properties()
        			.group(setup.itemGroup);
        	event.getRegistry().register(new BlockItem(ModBlocks.FIRSTBLOCK, properties).setRegistryName("firstblock"));
        	event.getRegistry().register(new FirstItem());
        }
        
        @SubscribeEvent
        public static void onTileEntityRegistry(final RegistryEvent.Register<TileEntityType<?>> event) {
        	event.getRegistry().register(TileEntityType.Builder.create(FirstBlockTile::new, ModBlocks.FIRSTBLOCK).build(null).setRegistryName("firstblock"));
        }
    }
}
