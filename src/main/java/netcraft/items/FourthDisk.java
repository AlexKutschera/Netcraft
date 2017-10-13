package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class FourthDisk extends Item {

    private static final String name = "64KByte_disk";

    public FourthDisk(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}
