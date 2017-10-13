package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class ThirdDisk extends Item {

    private static final String name = "third_disk";

    public ThirdDisk(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}