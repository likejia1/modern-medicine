
package net.likejia.xiandaiyiyao.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.likejia.xiandaiyiyao.procedures.FeiShengXiaoNangWanJiaWanChengShiYongWuPinShiProcedure;

import java.util.List;

public class FeiShengXiaoNangItem extends Item {
	public FeiShengXiaoNangItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u6E29\u99A8\u63D0\u793A\uFF1A\u6B64\u80F6\u56CA\u542B\u6709\u5267\u6BD2"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		FeiShengXiaoNangWanJiaWanChengShiYongWuPinShiProcedure.execute(entity);
		return retval;
	}
}
