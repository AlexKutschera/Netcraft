package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class SixthDisk extends Item {

    private static final String name = "512KByte_disk";

    public SixthDisk(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}
