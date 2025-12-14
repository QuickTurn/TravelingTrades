package net.quickturn.travelingtrading.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.quickturn.travelingtrading.TravelingTrading;

public class ModItems {
    public static final Item WOODEN_WHEEL = registerItem("wooden_wheel", new Item(new Item.Settings()));
    public static final Item CART_BASE = registerItem( "cart_base", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TravelingTrading.MOD_ID, name), item);
    }

    public static  void registerModItems() {
        TravelingTrading.LOGGER.info("Registering Mod Items for " + TravelingTrading.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(WOODEN_WHEEL);
            entries.add(CART_BASE);
        });
    }
}
