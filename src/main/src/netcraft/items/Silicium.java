package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class Silicium extends Item {

    private static final String name = "silicium";

    public Silicium(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}
