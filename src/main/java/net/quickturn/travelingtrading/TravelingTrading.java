package net.quickturn.travelingtrading;

import net.fabricmc.api.ModInitializer;

import net.quickturn.travelingtrading.item.ModItemGroup;
import net.quickturn.travelingtrading.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TravelingTrading implements ModInitializer {
	public static final String MOD_ID = "travelingtrading";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();


	}
}