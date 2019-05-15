package com.sirenliv.voidevolutions.init;

import com.sirenliv.voidevolutions.items.ItemBasic;
import com.sirenliv.voidevolutions.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModItems {
	
	static Item itemEmptyGenomeTube;
	static Item itemFilledGenomeTube;
	static Item itemBasicGeneticSlurry;
	
	public static void init() {
		itemEmptyGenomeTube = new ItemBasic("itemEmptyGenomeTube").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1);
		itemFilledGenomeTube = new ItemBasic("itemFilledGenomeTube").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1);
		itemBasicGeneticSlurry = new ItemBasic("itemBasicGeneticSlurry").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(itemEmptyGenomeTube);
		event.getRegistry().registerAll(itemFilledGenomeTube);
		event.getRegistry().registerAll(itemBasicGeneticSlurry);
}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(itemEmptyGenomeTube);
		registerRender(itemFilledGenomeTube);
		registerRender(itemBasicGeneticSlurry);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
