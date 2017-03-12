package com.Mrbysco.UnderPuzzle.blocks;

import com.Mrbysco.UnderPuzzle.PuzzleReference;
import com.Mrbysco.UnderPuzzle.UnderPuzzle;
import com.Mrbysco.UnderPuzzle.iFlavor;

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

public class PuzzleTilePurple extends Block implements iFlavor{

	public static double cooldown;
	
	public PuzzleTilePurple() {
		super(Material.CLOTH);
		setUnlocalizedName(PuzzleReference.PUZZLEBlocks.TILEPURPLE.getUnlocalisedName());
		setRegistryName(PuzzleReference.PUZZLEBlocks.TILEPURPLE.getRegistryName());
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
		flavourLemon(true);
		flavourOrange(false);
		if (cooldown < 0.010) 
		{
			this.sendText(worldIn, pos, player);
		}
		
		super.onEntityWalk(worldIn, pos, entityIn);
    }
	
	@Override
	public boolean flavourOrange(boolean isOrange) {
		return isOrange;
	}
	
	@Override
	public boolean flavourLemon(boolean isLemon) {
		return isLemon;
	}
	
	public void sendText(World worldIn, BlockPos pos, Entity entityIn)
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
