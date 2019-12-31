package com.nicholasingram.tutorial.setup;

import com.nicholasingram.tutorial.blocks.ModBlocks;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
	
	public ItemGroup itemGroup = new ItemGroup("tutorial") {
		
		@Override
		public ItemStack createIcon() {
			// TODO Auto-generated method stub
			return new ItemStack(ModBlocks.FIRSTBLOCK);
		}
	};
	
	public void init() {
		
	}
	
}
