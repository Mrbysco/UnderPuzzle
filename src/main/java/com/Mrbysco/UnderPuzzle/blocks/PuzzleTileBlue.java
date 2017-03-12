package com.Mrbysco.UnderPuzzle.blocks;

import com.Mrbysco.UnderPuzzle.PuzzleReference;
import com.Mrbysco.UnderPuzzle.UnderPuzzle;
import com.Mrbysco.UnderPuzzle.iFlavor;
import com.Mrbysco.UnderPuzzle.init.PuzzleBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class PuzzleTileBlue extends Block implements iFlavor{

	public static double cooldown;

	public PuzzleTileBlue() {
		super(Material.CLOTH);
		setUnlocalizedName(PuzzleReference.PUZZLEBlocks.TILEBLUE.getUnlocalisedName());
		setRegistryName(PuzzleReference.PUZZLEBlocks.TILEBLUE.getRegistryName());
		this.setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
		this.setLightOpacity(0);
		this.setHardness(1.0F);
		this.setSoundType(SoundType.STONE);
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
		cooldown = Math.random();
		EntityPlayer player = worldIn.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 100, false);
		Block blockN = worldIn.getBlockState(pos.north()).getBlock();
		Block blockE = worldIn.getBlockState(pos.east()).getBlock();
		Block blockS = worldIn.getBlockState(pos.south()).getBlock();
		Block blockW = worldIn.getBlockState(pos.west()).getBlock();
		
		if (blockN == PuzzleBlocks.tile_yellow || blockE == PuzzleBlocks.tile_yellow || blockS == PuzzleBlocks.tile_yellow || blockW == PuzzleBlocks.tile_yellow) {
			System.out.println("Adjecent block is yellow");
		}

		super.onEntityWalk(worldIn, pos, entityIn);
    }
	
	public void sendTextOrange(World worldIn, BlockPos pos, Entity entityIn)
	{
		if (RANDOM.nextInt(100) <30) 
		{ 
		entityIn.addChatMessage(new TextComponentTranslation("taste.orange1").setStyle(new Style().setColor(TextFormatting.GOLD)));
		}
		else if (RANDOM.nextInt(100) <60) 
		{ 
		entityIn.addChatMessage(new TextComponentTranslation("taste.orange2").setStyle(new Style().setColor(TextFormatting.GOLD)));
		}
		else
		{ 
		entityIn.addChatMessage(new TextComponentTranslation("taste.orange3").setStyle(new Style().setColor(TextFormatting.GOLD)));
		}
	}
	
	public void sendTextLemon(World worldIn, BlockPos pos, Entity entityIn)
	{
		if (RANDOM.nextInt(100) <30) 
		{ 
		entityIn.addChatMessage(new TextComponentTranslation("taste.lemon1").setStyle(new Style().setColor(TextFormatting.GOLD)));
		}
		else if (RANDOM.nextInt(100) <60) 
		{ 
		entityIn.addChatMessage(new TextComponentTranslation("taste.lemon2").setStyle(new Style().setColor(TextFormatting.GOLD)));
		}
		else
		{ 
		entityIn.addChatMessage(new TextComponentTranslation("taste.lemon3").setStyle(new Style().setColor(TextFormatting.GOLD)));
		}
	}
	
}
