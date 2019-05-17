package com.sirenliv.voidevolutions.init;

import com.sirenliv.voidevolutions.items.ItemBasic;
import com.sirenliv.voidevolutions.Reference;

import com.sirenliv.voidevolutions.items.ItemPerfectedVoidGenomeTube;
import com.sirenliv.voidevolutions.items.ItemRudimentaryVoidGenomeTube;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class Items {
	
	static Item itemEmptyGenomeTube;
	static Item itemPerfectedVoidGenomeTube;
	static Item itemRudimentaryGeneticSlurry;
	static Item itemRudimentaryGenomeTube;
	static Item itemPerfectedGeneticSlurry;
	
	public static void init() {
		itemEmptyGenomeTube = new ItemBasic("itemEmptyGenomeTube").setCreativeTab(tabVoidEvolutions).setMaxStackSize(1);
		itemPerfectedVoidGenomeTube = new ItemPerfectedVoidGenomeTube("itemPerfectedVoidGenomeTube").setCreativeTab(tabVoidEvolutions).setMaxStackSize(1);
		itemRudimentaryGenomeTube = new ItemRudimentaryVoidGenomeTube("itemRudimentaryVoidGenomeTube").setCreativeTab(tabVoidEvolutions).setMaxStackSize(1);
		itemRudimentaryGeneticSlurry = new ItemBasic("itemRudimentaryGeneticSlurry").setCreativeTab(tabVoidEvolutions).setMaxStackSize(1);
		itemPerfectedGeneticSlurry = new ItemBasic("itemPerfectedGeneticSlurry").setCreativeTab(tabVoidEvolutions).setMaxStackSize(1);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(itemEmptyGenomeTube);
		event.getRegistry().registerAll(itemRudimentaryGenomeTube);
		event.getRegistry().registerAll(itemPerfectedVoidGenomeTube);
		event.getRegistry().registerAll(itemRudimentaryGeneticSlurry);
		event.getRegistry().registerAll(itemPerfectedGeneticSlurry);
}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(itemEmptyGenomeTube);
		registerRender(itemRudimentaryGenomeTube);
		registerRender(itemPerfectedVoidGenomeTube);
		registerRender(itemRudimentaryGeneticSlurry);
		registerRender(itemPerfectedGeneticSlurry);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}

	static final CreativeTabs tabVoidEvolutions = (new CreativeTabs("tabVoidEvolutions") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(itemPerfectedVoidGenomeTube);
		}

		@Override
		public boolean hasSearchBar() {
			return true;
		}
	});
}
