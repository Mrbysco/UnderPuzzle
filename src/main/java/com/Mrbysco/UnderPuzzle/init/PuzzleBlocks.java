package com.Mrbysco.UnderPuzzle.init;
import java.util.Locale;

import com.Mrbysco.UnderPuzzle.PuzzleReference;
import com.Mrbysco.UnderPuzzle.UnderPuzzle;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTileBlue;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTileGreen;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTileOrange;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTilePink;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTilePurple;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTileYellow;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTileEntityTileRed;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class PuzzleBlocks {
	
public static Block tile_blue;
public static Block tile_green;
public static Block tile_orange;
public static Block tile_pink;
public static Block tile_purple;
public static Block underpuzzle_tile_red;
public static Block tile_yellow;
	
	public static void init()
	{
		
		tile_blue = new PuzzleTileBlue(Material.rock).setRegistryName("tile_blue").setUnlocalizedName("tile_blue").setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
		tile_green = new PuzzleTileGreen(Material.rock).setRegistryName("tile_green").setUnlocalizedName("tile_green").setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
		tile_orange = new PuzzleTileOrange(Material.rock).setRegistryName("tile_orange").setUnlocalizedName("tile_orange").setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
		tile_pink = new PuzzleTilePink(Material.rock).setRegistryName("tile_pink").setUnlocalizedName("tile_pink").setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
		tile_purple = new PuzzleTilePurple(Material.rock).setRegistryName("tile_purple").setUnlocalizedName("tile_purple").setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
		underpuzzle_tile_red = new PuzzleTileEntityTileRed(Material.rock).setRegistryName("tile_red").setUnlocalizedName("tile_red").setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
		tile_yellow = new PuzzleTileYellow(Material.rock).setRegistryName("tile_yellow").setUnlocalizedName("tile_yellow").setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
	}
	
	public static void register()
	{
		/*
		GameRegistry.registerBlock(tile_blue, tile_blue.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tile_green, tile_green.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tile_orange, tile_orange.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tile_pink, tile_pink.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tile_purple, tile_purple.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tile_red, tile_red.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tile_yellow, tile_yellow.getUnlocalizedName().substring(5));
		*/

		GameRegistry.register(tile_blue);
		GameRegistry.register(tile_green);
		GameRegistry.register(tile_orange);
		GameRegistry.register(tile_pink);
		GameRegistry.register(tile_purple);
		GameRegistry.register(underpuzzle_tile_red);
		GameRegistry.register(tile_yellow);
		GameRegistry.registerWithItem(tile_blue);
		GameRegistry.registerWithItem(tile_green);
		GameRegistry.registerWithItem(tile_orange);
		GameRegistry.registerWithItem(tile_pink);
		GameRegistry.registerWithItem(tile_purple);
		GameRegistry.registerWithItem(underpuzzle_tile_red);
		GameRegistry.registerWithItem(tile_yellow);
	}
	
	public static void registerRenders()
	{
		registerRender(tile_blue);
		registerRender(tile_green);
		registerRender(tile_orange);
		registerRender(tile_pink);
		registerRender(tile_purple);
		registerRender(underpuzzle_tile_red);
		registerRender(tile_yellow);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(PuzzleReference.MOD_ID + ":" + item.getUnlocalizedName().substring(5).toLowerCase(Locale.US), "inventory"));
	}
}