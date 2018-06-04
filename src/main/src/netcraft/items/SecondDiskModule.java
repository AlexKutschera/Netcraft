package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class SecondDiskModule extends Item
{

    private static final String name = "second_disk_module";

    public SecondDiskModule()
    {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}