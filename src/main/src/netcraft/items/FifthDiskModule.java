package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class FifthDiskModule extends Item
{

    private static final String name = "fifth_disk_module";

    public FifthDiskModule()
    {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}