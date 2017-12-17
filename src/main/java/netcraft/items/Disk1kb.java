package netcraft.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import netcraft.Netcraft;

public class Disk1kb extends Item {

    //Todo Platine für Crafting?
    //Todo Hab ich geändert. Macht mehr Sinn. Neue Rezepte sind auf OneNote online.

    private static final String name = "disk1kb";
    private int maxStackSize = 1;

    @Override
    public Item setMaxStackSize(int maxStackSize) {
        this.maxStackSize = maxStackSize;
        return this;
    }

    @Override
    public int getItemStackLimit(ItemStack stack)
    {
        return this.maxStackSize;
    }

    public Disk1kb() {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}
