package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class ThirdDiskModule extends Item
{

    private static final String name = "third_disk_module";

    public ThirdDiskModule()
    {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}