package com.Mrbysco.UnderPuzzle.init;
import com.Mrbysco.UnderPuzzle.blocks.MobPassibleBlock;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTileBlue;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTileGreen;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTileOrange;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTilePink;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTilePurple;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTileRed;
import com.Mrbysco.UnderPuzzle.blocks.PuzzleTileYellow;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class PuzzleBlocks {
	
public static Block tile_blue;
public static Block tile_green;
public static Block tile_orange;
public static Block tile_pink;
public static Block tile_purple;
public static Block tile_red;
public static Block tile_yellow;
public static Block player_wall;
	
	public static void init()
	{
		tile_blue = new PuzzleTileBlue();
		tile_green = new PuzzleTileGreen();
		tile_orange = new PuzzleTileOrange();
		tile_pink = new PuzzleTilePink();
		tile_purple = new PuzzleTilePurple();
		tile_red = new PuzzleTileRed();
		tile_yellow = new PuzzleTileYellow();
		player_wall = new MobPassibleBlock();

	}
	
	public static void register()
	{
		registerBlock(tile_blue);
		registerBlock(tile_green);
		registerBlock(tile_orange);
		registerBlock(tile_pink);
		registerBlock(tile_purple);
		registerBlock(tile_red);
		registerBlock(tile_yellow);
		registerBlock(player_wall);

	}
	
	public static void registerBlock(Block block) 
	{
		registerBlock(block, new ItemBlock(block));
	}
	
	public static void registerBlock(Block block, ItemBlock item) 
	{
		GameRegistry.register(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders()
	{
		registerRender(tile_blue);
		registerRender(tile_green);
		registerRender(tile_orange);
		registerRender(tile_pink);
		registerRender(tile_purple);
		registerRender(tile_red);
		registerRender(tile_yellow);
		registerRender(player_wall);

	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}