package com.Mrbysco.UnderPuzzle.init;

import java.util.Locale;

import com.Mrbysco.UnderPuzzle.PuzzleReference;
import com.Mrbysco.UnderPuzzle.UnderPuzzle;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PuzzleItems{
	
	public static Item tab_icon;

	public static void init()
	{
		tab_icon = new Item().setRegistryName("tab_icon").setUnlocalizedName("tab_icon");
	}
	
	public static void register()
	{
		GameRegistry.register(tab_icon);
	}
	
	public static void registerRenders()
	{
		registerRender(tab_icon);
	}
	
	public static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(PuzzleReference.MOD_ID + ":" + item.getUnlocalizedName().substring(5).toLowerCase(Locale.US), "inventory"));
	}
}
