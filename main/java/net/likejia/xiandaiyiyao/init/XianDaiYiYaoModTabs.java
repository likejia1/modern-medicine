
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.likejia.xiandaiyiyao.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.likejia.xiandaiyiyao.XianDaiYiYaoMod;

public class XianDaiYiYaoModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, XianDaiYiYaoMod.MODID);
	public static final RegistryObject<CreativeModeTab> XIAN_DAI_YI_YAO_XUAN_XIANG_QIA = REGISTRY.register("xian_dai_yi_yao_xuan_xiang_qia",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.xian_dai_yi_yao.xian_dai_yi_yao_xuan_xiang_qia")).icon(() -> new ItemStack(XianDaiYiYaoModItems.YAO_PIN_BAO_HE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(XianDaiYiYaoModItems.KONG_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.YAO_PIN_BAO_HE.get());
				tabData.accept(XianDaiYiYaoModItems.XIAO_NANG_FANG_HUO.get());
				tabData.accept(XianDaiYiYaoModItems.XIAO_NANG_HUAN_JIANG.get());
				tabData.accept(XianDaiYiYaoModItems.XIAO_NANG_SHEN_GUI.get());
				tabData.accept(XianDaiYiYaoModItems.XIAO_NANG_LI_LIANG.get());
				tabData.accept(XianDaiYiYaoModItems.JIN_PI_GU_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.XIAO_NANG_SHUI_FEI.get());
				tabData.accept(XianDaiYiYaoModItems.XIAO_NANG_ZHI_LIAO.get());
				tabData.accept(XianDaiYiYaoModItems.SU_DU_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.TIAO_YUE_TI_SHENG_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.YE_SHI_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.YIN_SHEN_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.HEI_AN_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.DIAO_LING_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.FAN_WEI_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.HUAN_MAN_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.PIAO_FU_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.SHI_MING_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.FEI_SHENG_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.XU_RUO_XIAO_NANG.get());
				tabData.accept(XianDaiYiYaoModItems.MAN_XING_DU_YAO_XIAO_NANG.get());
			})

					.build());
}
