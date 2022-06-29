package au.keal.mr_pinks;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.keal.mr_pinks.items.Items;

public class PotionPack implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("mr-pinks-potion-pack");

	@Override
	public void onInitialize() {
		Items.register();
		LOGGER.info("Initialized!");
	}
}
