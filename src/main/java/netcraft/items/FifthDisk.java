package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class FifthDisk extends Item {

    private static final String name = "fifth_disk";

    public FifthDisk(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}
