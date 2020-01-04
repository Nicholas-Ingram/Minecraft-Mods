package com.nicholasingram.tutorial.blocks;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nullable;

import com.nicholasingram.tutorial.blocks.ModBlocks;

public class FirstBlockTile extends TileEntity implements ITickableTileEntity {

	private ItemStackHandler handler;
	
	public FirstBlockTile() {
		super(ModBlocks.FIRSTBLOCK_TILE);
	}

	@Override
	public void tick() {
		if (world.isRemote) {
			
		}
	}
	
	@Override
	public void read(CompoundNBT tag) {
		CompoundNBT invTag = tag.getCompound("inv");
		getHandler().deserializeNBT(invTag);
		super.read(tag);
	}
	
	@Override
	public CompoundNBT write(CompoundNBT tag) {
		CompoundNBT compound = getHandler().serializeNBT();
		tag.put("inv", compound);
		return super.write(tag);
	}
	
	private ItemStackHandler getHandler() {
		if (handler == null) {
			handler = new ItemStackHandler(1) {
				@Override
				public boolean isItemValid(int slot, ItemStack stack) {
					return stack.getItem() == Items.DIAMOND;
				}
				
				@Override
				public ItemStack insertItem(int slot, ItemStack stack, boolean simulate) {
					if (stack.getItem() != Items.DIAMOND) {
						return stack;
					}
					return super.insertItem(slot, stack, simulate);
				}
			};
		}
		return handler;
	}
	
	@Nullable
	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
		if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
			return LazyOptional.of(() -> (T) getHandler());
		}
		return super.getCapability(cap, side);
	}

}
