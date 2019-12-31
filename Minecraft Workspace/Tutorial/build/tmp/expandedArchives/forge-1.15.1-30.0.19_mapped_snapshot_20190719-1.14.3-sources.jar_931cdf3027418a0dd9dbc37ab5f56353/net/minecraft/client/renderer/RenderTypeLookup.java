package net.minecraft.client.renderer;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Util;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RenderTypeLookup {
   @Deprecated
   private static final Map<Block, RenderType> field_228386_a_ = Util.make(Maps.newHashMap(), (p_228395_0_) -> {
      RenderType rendertype = RenderType.func_228641_d_();
      p_228395_0_.put(Blocks.GRASS_BLOCK, rendertype);
      p_228395_0_.put(Blocks.IRON_BARS, rendertype);
      p_228395_0_.put(Blocks.GLASS_PANE, rendertype);
      p_228395_0_.put(Blocks.TRIPWIRE_HOOK, rendertype);
      p_228395_0_.put(Blocks.HOPPER, rendertype);
      p_228395_0_.put(Blocks.JUNGLE_LEAVES, rendertype);
      p_228395_0_.put(Blocks.OAK_LEAVES, rendertype);
      p_228395_0_.put(Blocks.SPRUCE_LEAVES, rendertype);
      p_228395_0_.put(Blocks.ACACIA_LEAVES, rendertype);
      p_228395_0_.put(Blocks.BIRCH_LEAVES, rendertype);
      p_228395_0_.put(Blocks.DARK_OAK_LEAVES, rendertype);
      RenderType rendertype1 = RenderType.func_228643_e_();
      p_228395_0_.put(Blocks.OAK_SAPLING, rendertype1);
      p_228395_0_.put(Blocks.SPRUCE_SAPLING, rendertype1);
      p_228395_0_.put(Blocks.BIRCH_SAPLING, rendertype1);
      p_228395_0_.put(Blocks.JUNGLE_SAPLING, rendertype1);
      p_228395_0_.put(Blocks.ACACIA_SAPLING, rendertype1);
      p_228395_0_.put(Blocks.DARK_OAK_SAPLING, rendertype1);
      p_228395_0_.put(Blocks.GLASS, rendertype1);
      p_228395_0_.put(Blocks.WHITE_BED, rendertype1);
      p_228395_0_.put(Blocks.ORANGE_BED, rendertype1);
      p_228395_0_.put(Blocks.MAGENTA_BED, rendertype1);
      p_228395_0_.put(Blocks.LIGHT_BLUE_BED, rendertype1);
      p_228395_0_.put(Blocks.YELLOW_BED, rendertype1);
      p_228395_0_.put(Blocks.LIME_BED, rendertype1);
      p_228395_0_.put(Blocks.PINK_BED, rendertype1);
      p_228395_0_.put(Blocks.GRAY_BED, rendertype1);
      p_228395_0_.put(Blocks.LIGHT_GRAY_BED, rendertype1);
      p_228395_0_.put(Blocks.CYAN_BED, rendertype1);
      p_228395_0_.put(Blocks.PURPLE_BED, rendertype1);
      p_228395_0_.put(Blocks.BLUE_BED, rendertype1);
      p_228395_0_.put(Blocks.BROWN_BED, rendertype1);
      p_228395_0_.put(Blocks.GREEN_BED, rendertype1);
      p_228395_0_.put(Blocks.RED_BED, rendertype1);
      p_228395_0_.put(Blocks.BLACK_BED, rendertype1);
      p_228395_0_.put(Blocks.POWERED_RAIL, rendertype1);
      p_228395_0_.put(Blocks.DETECTOR_RAIL, rendertype1);
      p_228395_0_.put(Blocks.COBWEB, rendertype1);
      p_228395_0_.put(Blocks.GRASS, rendertype1);
      p_228395_0_.put(Blocks.FERN, rendertype1);
      p_228395_0_.put(Blocks.DEAD_BUSH, rendertype1);
      p_228395_0_.put(Blocks.SEAGRASS, rendertype1);
      p_228395_0_.put(Blocks.TALL_SEAGRASS, rendertype1);
      p_228395_0_.put(Blocks.DANDELION, rendertype1);
      p_228395_0_.put(Blocks.POPPY, rendertype1);
      p_228395_0_.put(Blocks.BLUE_ORCHID, rendertype1);
      p_228395_0_.put(Blocks.ALLIUM, rendertype1);
      p_228395_0_.put(Blocks.AZURE_BLUET, rendertype1);
      p_228395_0_.put(Blocks.RED_TULIP, rendertype1);
      p_228395_0_.put(Blocks.ORANGE_TULIP, rendertype1);
      p_228395_0_.put(Blocks.WHITE_TULIP, rendertype1);
      p_228395_0_.put(Blocks.PINK_TULIP, rendertype1);
      p_228395_0_.put(Blocks.OXEYE_DAISY, rendertype1);
      p_228395_0_.put(Blocks.CORNFLOWER, rendertype1);
      p_228395_0_.put(Blocks.WITHER_ROSE, rendertype1);
      p_228395_0_.put(Blocks.LILY_OF_THE_VALLEY, rendertype1);
      p_228395_0_.put(Blocks.BROWN_MUSHROOM, rendertype1);
      p_228395_0_.put(Blocks.RED_MUSHROOM, rendertype1);
      p_228395_0_.put(Blocks.TORCH, rendertype1);
      p_228395_0_.put(Blocks.WALL_TORCH, rendertype1);
      p_228395_0_.put(Blocks.FIRE, rendertype1);
      p_228395_0_.put(Blocks.SPAWNER, rendertype1);
      p_228395_0_.put(Blocks.REDSTONE_WIRE, rendertype1);
      p_228395_0_.put(Blocks.WHEAT, rendertype1);
      p_228395_0_.put(Blocks.OAK_DOOR, rendertype1);
      p_228395_0_.put(Blocks.LADDER, rendertype1);
      p_228395_0_.put(Blocks.RAIL, rendertype1);
      p_228395_0_.put(Blocks.IRON_DOOR, rendertype1);
      p_228395_0_.put(Blocks.REDSTONE_TORCH, rendertype1);
      p_228395_0_.put(Blocks.REDSTONE_WALL_TORCH, rendertype1);
      p_228395_0_.put(Blocks.CACTUS, rendertype1);
      p_228395_0_.put(Blocks.SUGAR_CANE, rendertype1);
      p_228395_0_.put(Blocks.REPEATER, rendertype1);
      p_228395_0_.put(Blocks.OAK_TRAPDOOR, rendertype1);
      p_228395_0_.put(Blocks.SPRUCE_TRAPDOOR, rendertype1);
      p_228395_0_.put(Blocks.BIRCH_TRAPDOOR, rendertype1);
      p_228395_0_.put(Blocks.JUNGLE_TRAPDOOR, rendertype1);
      p_228395_0_.put(Blocks.ACACIA_TRAPDOOR, rendertype1);
      p_228395_0_.put(Blocks.DARK_OAK_TRAPDOOR, rendertype1);
      p_228395_0_.put(Blocks.ATTACHED_PUMPKIN_STEM, rendertype1);
      p_228395_0_.put(Blocks.ATTACHED_MELON_STEM, rendertype1);
      p_228395_0_.put(Blocks.PUMPKIN_STEM, rendertype1);
      p_228395_0_.put(Blocks.MELON_STEM, rendertype1);
      p_228395_0_.put(Blocks.VINE, rendertype1);
      p_228395_0_.put(Blocks.LILY_PAD, rendertype1);
      p_228395_0_.put(Blocks.NETHER_WART, rendertype1);
      p_228395_0_.put(Blocks.BREWING_STAND, rendertype1);
      p_228395_0_.put(Blocks.COCOA, rendertype1);
      p_228395_0_.put(Blocks.BEACON, rendertype1);
      p_228395_0_.put(Blocks.FLOWER_POT, rendertype1);
      p_228395_0_.put(Blocks.POTTED_OAK_SAPLING, rendertype1);
      p_228395_0_.put(Blocks.POTTED_SPRUCE_SAPLING, rendertype1);
      p_228395_0_.put(Blocks.POTTED_BIRCH_SAPLING, rendertype1);
      p_228395_0_.put(Blocks.POTTED_JUNGLE_SAPLING, rendertype1);
      p_228395_0_.put(Blocks.POTTED_ACACIA_SAPLING, rendertype1);
      p_228395_0_.put(Blocks.POTTED_DARK_OAK_SAPLING, rendertype1);
      p_228395_0_.put(Blocks.POTTED_FERN, rendertype1);
      p_228395_0_.put(Blocks.POTTED_DANDELION, rendertype1);
      p_228395_0_.put(Blocks.POTTED_POPPY, rendertype1);
      p_228395_0_.put(Blocks.POTTED_BLUE_ORCHID, rendertype1);
      p_228395_0_.put(Blocks.POTTED_ALLIUM, rendertype1);
      p_228395_0_.put(Blocks.POTTED_AZURE_BLUET, rendertype1);
      p_228395_0_.put(Blocks.POTTED_RED_TULIP, rendertype1);
      p_228395_0_.put(Blocks.POTTED_ORANGE_TULIP, rendertype1);
      p_228395_0_.put(Blocks.POTTED_WHITE_TULIP, rendertype1);
      p_228395_0_.put(Blocks.POTTED_PINK_TULIP, rendertype1);
      p_228395_0_.put(Blocks.POTTED_OXEYE_DAISY, rendertype1);
      p_228395_0_.put(Blocks.POTTED_CORNFLOWER, rendertype1);
      p_228395_0_.put(Blocks.POTTED_LILY_OF_THE_VALLEY, rendertype1);
      p_228395_0_.put(Blocks.POTTED_WITHER_ROSE, rendertype1);
      p_228395_0_.put(Blocks.POTTED_RED_MUSHROOM, rendertype1);
      p_228395_0_.put(Blocks.POTTED_BROWN_MUSHROOM, rendertype1);
      p_228395_0_.put(Blocks.POTTED_DEAD_BUSH, rendertype1);
      p_228395_0_.put(Blocks.POTTED_CACTUS, rendertype1);
      p_228395_0_.put(Blocks.CARROTS, rendertype1);
      p_228395_0_.put(Blocks.POTATOES, rendertype1);
      p_228395_0_.put(Blocks.COMPARATOR, rendertype1);
      p_228395_0_.put(Blocks.ACTIVATOR_RAIL, rendertype1);
      p_228395_0_.put(Blocks.IRON_TRAPDOOR, rendertype1);
      p_228395_0_.put(Blocks.SUNFLOWER, rendertype1);
      p_228395_0_.put(Blocks.LILAC, rendertype1);
      p_228395_0_.put(Blocks.ROSE_BUSH, rendertype1);
      p_228395_0_.put(Blocks.PEONY, rendertype1);
      p_228395_0_.put(Blocks.TALL_GRASS, rendertype1);
      p_228395_0_.put(Blocks.LARGE_FERN, rendertype1);
      p_228395_0_.put(Blocks.SPRUCE_DOOR, rendertype1);
      p_228395_0_.put(Blocks.BIRCH_DOOR, rendertype1);
      p_228395_0_.put(Blocks.JUNGLE_DOOR, rendertype1);
      p_228395_0_.put(Blocks.ACACIA_DOOR, rendertype1);
      p_228395_0_.put(Blocks.DARK_OAK_DOOR, rendertype1);
      p_228395_0_.put(Blocks.END_ROD, rendertype1);
      p_228395_0_.put(Blocks.CHORUS_PLANT, rendertype1);
      p_228395_0_.put(Blocks.CHORUS_FLOWER, rendertype1);
      p_228395_0_.put(Blocks.BEETROOTS, rendertype1);
      p_228395_0_.put(Blocks.KELP, rendertype1);
      p_228395_0_.put(Blocks.KELP_PLANT, rendertype1);
      p_228395_0_.put(Blocks.TURTLE_EGG, rendertype1);
      p_228395_0_.put(Blocks.DEAD_TUBE_CORAL, rendertype1);
      p_228395_0_.put(Blocks.DEAD_BRAIN_CORAL, rendertype1);
      p_228395_0_.put(Blocks.DEAD_BUBBLE_CORAL, rendertype1);
      p_228395_0_.put(Blocks.DEAD_FIRE_CORAL, rendertype1);
      p_228395_0_.put(Blocks.DEAD_HORN_CORAL, rendertype1);
      p_228395_0_.put(Blocks.TUBE_CORAL, rendertype1);
      p_228395_0_.put(Blocks.BRAIN_CORAL, rendertype1);
      p_228395_0_.put(Blocks.BUBBLE_CORAL, rendertype1);
      p_228395_0_.put(Blocks.FIRE_CORAL, rendertype1);
      p_228395_0_.put(Blocks.HORN_CORAL, rendertype1);
      p_228395_0_.put(Blocks.DEAD_TUBE_CORAL_FAN, rendertype1);
      p_228395_0_.put(Blocks.DEAD_BRAIN_CORAL_FAN, rendertype1);
      p_228395_0_.put(Blocks.DEAD_BUBBLE_CORAL_FAN, rendertype1);
      p_228395_0_.put(Blocks.DEAD_FIRE_CORAL_FAN, rendertype1);
      p_228395_0_.put(Blocks.DEAD_HORN_CORAL_FAN, rendertype1);
      p_228395_0_.put(Blocks.TUBE_CORAL_FAN, rendertype1);
      p_228395_0_.put(Blocks.BRAIN_CORAL_FAN, rendertype1);
      p_228395_0_.put(Blocks.BUBBLE_CORAL_FAN, rendertype1);
      p_228395_0_.put(Blocks.FIRE_CORAL_FAN, rendertype1);
      p_228395_0_.put(Blocks.HORN_CORAL_FAN, rendertype1);
      p_228395_0_.put(Blocks.DEAD_TUBE_CORAL_WALL_FAN, rendertype1);
      p_228395_0_.put(Blocks.DEAD_BRAIN_CORAL_WALL_FAN, rendertype1);
      p_228395_0_.put(Blocks.DEAD_BUBBLE_CORAL_WALL_FAN, rendertype1);
      p_228395_0_.put(Blocks.DEAD_FIRE_CORAL_WALL_FAN, rendertype1);
      p_228395_0_.put(Blocks.DEAD_HORN_CORAL_WALL_FAN, rendertype1);
      p_228395_0_.put(Blocks.TUBE_CORAL_WALL_FAN, rendertype1);
      p_228395_0_.put(Blocks.BRAIN_CORAL_WALL_FAN, rendertype1);
      p_228395_0_.put(Blocks.BUBBLE_CORAL_WALL_FAN, rendertype1);
      p_228395_0_.put(Blocks.FIRE_CORAL_WALL_FAN, rendertype1);
      p_228395_0_.put(Blocks.HORN_CORAL_WALL_FAN, rendertype1);
      p_228395_0_.put(Blocks.SEA_PICKLE, rendertype1);
      p_228395_0_.put(Blocks.CONDUIT, rendertype1);
      p_228395_0_.put(Blocks.BAMBOO_SAPLING, rendertype1);
      p_228395_0_.put(Blocks.BAMBOO, rendertype1);
      p_228395_0_.put(Blocks.POTTED_BAMBOO, rendertype1);
      p_228395_0_.put(Blocks.SCAFFOLDING, rendertype1);
      p_228395_0_.put(Blocks.STONECUTTER, rendertype1);
      p_228395_0_.put(Blocks.LANTERN, rendertype1);
      p_228395_0_.put(Blocks.CAMPFIRE, rendertype1);
      p_228395_0_.put(Blocks.SWEET_BERRY_BUSH, rendertype1);
      RenderType rendertype2 = RenderType.func_228645_f_();
      p_228395_0_.put(Blocks.ICE, rendertype2);
      p_228395_0_.put(Blocks.NETHER_PORTAL, rendertype2);
      p_228395_0_.put(Blocks.WHITE_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.ORANGE_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.MAGENTA_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.LIGHT_BLUE_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.YELLOW_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.LIME_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.PINK_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.GRAY_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.LIGHT_GRAY_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.CYAN_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.PURPLE_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.BLUE_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.BROWN_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.GREEN_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.RED_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.BLACK_STAINED_GLASS, rendertype2);
      p_228395_0_.put(Blocks.TRIPWIRE, rendertype2);
      p_228395_0_.put(Blocks.WHITE_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.ORANGE_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.MAGENTA_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.YELLOW_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.LIME_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.PINK_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.GRAY_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.CYAN_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.PURPLE_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.BLUE_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.BROWN_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.GREEN_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.RED_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.BLACK_STAINED_GLASS_PANE, rendertype2);
      p_228395_0_.put(Blocks.SLIME_BLOCK, rendertype2);
      p_228395_0_.put(Blocks.field_226907_mc_, rendertype2);
      p_228395_0_.put(Blocks.FROSTED_ICE, rendertype2);
      p_228395_0_.put(Blocks.BUBBLE_COLUMN, rendertype2);
   });
   @Deprecated
   private static final Map<Fluid, RenderType> field_228387_b_ = Util.make(Maps.newHashMap(), (p_228392_0_) -> {
      RenderType rendertype = RenderType.func_228645_f_();
      p_228392_0_.put(Fluids.FLOWING_WATER, rendertype);
      p_228392_0_.put(Fluids.WATER, rendertype);
   });
   private static boolean field_228388_c_;

   @Deprecated
   public static RenderType func_228390_a_(BlockState p_228390_0_) {
      Block block = p_228390_0_.getBlock();
      if (block instanceof LeavesBlock) {
         return field_228388_c_ ? RenderType.func_228641_d_() : RenderType.func_228639_c_();
      } else {
         RenderType rendertype = field_228386_a_.get(block);
         return rendertype != null ? rendertype : RenderType.func_228639_c_();
      }
   }

   public static RenderType func_228394_b_(BlockState p_228394_0_) {
      return canRenderInLayer(p_228394_0_, RenderType.func_228645_f_()) ? Atlases.func_228784_i_() : Atlases.func_228783_h_();
   }

   public static RenderType func_228389_a_(ItemStack p_228389_0_) {
      Item item = p_228389_0_.getItem();
      if (item instanceof BlockItem) {
         Block block = ((BlockItem)item).getBlock();
         return func_228394_b_(block.getDefaultState());
      } else {
         return Atlases.func_228784_i_();
      }
   }

   @Deprecated
   public static RenderType func_228391_a_(IFluidState p_228391_0_) {
      RenderType rendertype = field_228387_b_.get(p_228391_0_.getFluid());
      return rendertype != null ? rendertype : RenderType.func_228639_c_();
   }

   // FORGE START

   private static final Map<Block, java.util.function.Predicate<RenderType>> blockRenderChecks = Maps.newHashMap();
   private static final Map<Fluid, java.util.function.Predicate<RenderType>> fluidRenderChecks = Maps.newHashMap();
   static {
      field_228386_a_.forEach(RenderTypeLookup::setRenderLayer);
      field_228387_b_.forEach(RenderTypeLookup::setRenderLayer);
   }

   public static boolean canRenderInLayer(BlockState state, RenderType type) {
      Block block = state.getBlock();
      if (block instanceof LeavesBlock) {
         return field_228388_c_ ? type == RenderType.func_228641_d_() : type == RenderType.func_228639_c_();
      } else {
         java.util.function.Predicate<RenderType> rendertype;
         synchronized (RenderTypeLookup.class) {
             rendertype = blockRenderChecks.get(block);
         }
         return rendertype != null ? rendertype.test(type) : type == RenderType.func_228639_c_();
      }
   }

   public static boolean canRenderInLayer(IFluidState fluid, RenderType type) {
      java.util.function.Predicate<RenderType> rendertype;
      synchronized (RenderTypeLookup.class) {
          rendertype = fluidRenderChecks.get(fluid.getFluid());
      }
      return rendertype != null ? rendertype.test(type) : type == RenderType.func_228639_c_();
   }

   public static void setRenderLayer(Block block, RenderType type) {
       java.util.Objects.requireNonNull(type);
       setRenderLayer(block, type::equals);
   }

   public static synchronized void setRenderLayer(Block block, java.util.function.Predicate<RenderType> predicate) {
       blockRenderChecks.put(block, predicate);
   }

   public static void setRenderLayer(Fluid fluid, RenderType type) {
       java.util.Objects.requireNonNull(type);
       setRenderLayer(fluid, type::equals);
   }

   public static synchronized void setRenderLayer(Fluid fluid, java.util.function.Predicate<RenderType> predicate) {
       fluidRenderChecks.put(fluid, predicate);
   }

   public static void func_228393_a_(boolean p_228393_0_) {
      field_228388_c_ = p_228393_0_;
   }
}