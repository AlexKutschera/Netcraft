package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class SixthDiskModule extends Item
{

    private static final String name = "sixth_disk_module";

    public SixthDiskModule()
    {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}