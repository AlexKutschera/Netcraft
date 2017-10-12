package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;
import netcraft.init.Items;

public class Cuprit extends Item implements IHasModel {

    public static final String name = "cuprit";

    public Cuprit(){
        setRegistryName(name);
        setUnlocalizedName(name);

        Items.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Netcraft.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
