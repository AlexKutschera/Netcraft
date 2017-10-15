package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class FourthDiskModule extends Item
{

    private static final String name = "fourth_disk_module";

    public FourthDiskModule()
    {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}