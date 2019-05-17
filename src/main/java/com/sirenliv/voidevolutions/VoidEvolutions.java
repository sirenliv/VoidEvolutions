package com.sirenliv.voidevolutions;

import com.sirenliv.voidevolutions.init.Items;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class VoidEvolutions {
	
	@Instance
	public static VoidEvolutions instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Items.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
}
