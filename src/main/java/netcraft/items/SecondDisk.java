package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class SecondDisk extends Item {

    private static final String name = "4KByte_disk";

    public SecondDisk(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}
