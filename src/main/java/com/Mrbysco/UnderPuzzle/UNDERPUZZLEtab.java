package com.Mrbysco.UnderPuzzle;

import com.Mrbysco.UnderPuzzle.init.PuzzleItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class UNDERPUZZLEtab extends CreativeTabs {

	public UNDERPUZZLEtab (String label) { 
		super(label);
		this.setBackgroundImageName("underpuzzle.png");
	}

	@Override
	public Item getTabIconItem() {
		return PuzzleItems.tab_icon;
	}

	public UNDERPUZZLEtab setCreativeTab(UNDERPUZZLEtab tabunderpuzzle) {
		// TODO Auto-generated method stub
		return null;
	}
}