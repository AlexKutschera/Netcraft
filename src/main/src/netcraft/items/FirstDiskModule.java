package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class FirstDiskModule extends Item
{

    private static final String name = "first_disk_module";

    public FirstDiskModule()
    {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}