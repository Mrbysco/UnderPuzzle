package com.Mrbysco.UnderPuzzle.blocks;

import java.util.List;

import com.Mrbysco.UnderPuzzle.PuzzleReference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MobPassibleBlock extends Block{

	public MobPassibleBlock() {
		super(Material.BARRIER);
		setUnlocalizedName(PuzzleReference.PUZZLEBlocks.PLAYERWALL.getUnlocalisedName());
		setRegistryName(PuzzleReference.PUZZLEBlocks.PLAYERWALL.getRegistryName());
		this.setBlockUnbreakable();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
	
	@Override
	public boolean isFullCube(IBlockState state)
    {
        return true;
    }
	
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
}
