package au.keal.mr_pinks.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

	public static BluePotion BLUE_POTION = new BluePotion(new FabricItemSettings().group(ItemGroup.MISC));
	public static GoldPotion GOLD_POTION = new GoldPotion(new FabricItemSettings().group(ItemGroup.MISC));
	public static RedPotion RED_POTION = new RedPotion(new FabricItemSettings().group(ItemGroup.MISC));
	public static WhitePotion WHITE_POTION = new WhitePotion(new FabricItemSettings().group(ItemGroup.MISC));

	public static void register() {
		Registry.register(Registry.ITEM, new Identifier("mr_pinks", "blue_potion"), BLUE_POTION);
		Registry.register(Registry.ITEM, new Identifier("mr_pinks", "gold_potion"), GOLD_POTION);
		Registry.register(Registry.ITEM, new Identifier("mr_pinks", "red_potion"), RED_POTION);
		Registry.register(Registry.ITEM, new Identifier("mr_pinks", "white_potion"), WHITE_POTION);
	}
}
