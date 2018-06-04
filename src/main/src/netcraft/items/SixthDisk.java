package netcraft.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import netcraft.Netcraft;

public class SixthDisk extends Item {

    private static final String name = "sixth_disk";
    protected int maxStackSize = 1;

    @Override
    public Item setMaxStackSize(int maxStackSize)
    {
        this.maxStackSize = maxStackSize;
        return this;
    }

    @Override
    public int getItemStackLimit(ItemStack stack)
    {
        return this.maxStackSize;
    }

    public SixthDisk(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}
