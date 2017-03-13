package com.Mrbysco.UnderPuzzle.blocks;

import com.Mrbysco.UnderPuzzle.PuzzleReference;
import com.Mrbysco.UnderPuzzle.UnderPuzzle;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PuzzleTileYellow extends Block{

	public PuzzleTileYellow() {
		super(Material.ROCK);
		setUnlocalizedName(PuzzleReference.PUZZLEBlocks.TILEYELLOW.getUnlocalisedName());
		setRegistryName(PuzzleReference.PUZZLEBlocks.TILEYELLOW.getRegistryName());
		this.setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
		this.setLightOpacity(0);
		this.setHardness(1.0F);
		this.setSoundType(SoundType.STONE);
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		
		EntityPlayer player = worldIn.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 2, false);
		int PreviousX = player.getEntityData().getInteger("PreviousPuzzlePosX");
		int PreviousY = player.getEntityData().getInteger("PreviousPuzzlePosY");
		int PreviousZ = player.getEntityData().getInteger("PreviousPuzzlePosZ");
		
		player.attemptTeleport(PreviousX +0.5D, PreviousY, PreviousZ +0.5D);
		System.out.println("x:" + PreviousX + " y:" + PreviousY + " z:" + PreviousZ);

		
		super.onEntityWalk(worldIn, pos, entityIn);
	}
}
