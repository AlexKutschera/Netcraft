package netcraft.handlers;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import netcraft.init.Items;

@Mod.EventBusSubscriber
public class RegistryHandler {

    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(Items.ITEMS.toArray(new Item[0]));
    }

}
