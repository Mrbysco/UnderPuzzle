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
		if (entityIn instanceof EntityPlayer)
		{
			cooldown = Math.random();
			EntityPlayer player = worldIn.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 2, false);
			Block blockN = worldIn.getBlockState(pos.north()).getBlock();
			Block blockE = worldIn.getBlockState(pos.east()).getBlock();
			Block blockS = worldIn.getBlockState(pos.south()).getBlock();
			Block blockW = worldIn.getBlockState(pos.west()).getBlock();
			
			int PreviousX = player.getEntityData().getInteger("PreviousPuzzlePosX");
			int PreviousY = player.getEntityData().getInteger("PreviousPuzzlePosY");
			int PreviousZ = player.getEntityData().getInteger("PreviousPuzzlePosZ");
			
			if (blockN == PuzzleBlocks.tile_yellow || blockE == PuzzleBlocks.tile_yellow || blockS == PuzzleBlocks.tile_yellow || blockW == PuzzleBlocks.tile_yellow || player.getEntityData().getBoolean("likesOrange") == true) 
			{
				player.attemptTeleport(PreviousX +0.5D, PreviousY, PreviousZ +0.5D);
			}
			
			if (blockN != PuzzleBlocks.tile_yellow && player.getEntityData().getBoolean("likesOrange") != true || blockE != PuzzleBlocks.tile_yellow && player.getEntityData().getBoolean("likesOrange") != true || blockS != PuzzleBlocks.tile_yellow && player.getEntityData().getBoolean("likesOrange") != true || blockW != PuzzleBlocks.tile_yellow && player.getEntityData().getBoolean("likesOrange") != true)
			{
				player.getEntityData().setInteger("PreviousPuzzlePosX",(int) player.posX);
				player.getEntityData().setInteger("PreviousPuzzlePosY",(int) player.posY);
				player.getEntityData().setInteger("PreviousPuzzlePosZ",(int) player.posZ);
			}
		}
		super.onEntityWalk(worldIn, pos, entityIn);
    }
	
}
