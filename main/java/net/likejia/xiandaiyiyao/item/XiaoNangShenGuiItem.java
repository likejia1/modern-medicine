
package net.likejia.xiandaiyiyao.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.likejia.xiandaiyiyao.procedures.XiaoNangShenGuiWanJiaWanChengShiYongWuPinShiProcedure;

public class XiaoNangShenGuiItem extends Item {
	public XiaoNangShenGuiItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 10;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		XiaoNangShenGuiWanJiaWanChengShiYongWuPinShiProcedure.execute(entity);
		return retval;
	}
}
