package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class FirstDisk extends Item {

    private static final String name = "first_disk";

    public FirstDisk(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}
