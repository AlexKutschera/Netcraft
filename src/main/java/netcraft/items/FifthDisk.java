package netcraft.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import netcraft.Netcraft;

public class FifthDisk extends Item {

    private static final String name = "fifth_disk";
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

    public FifthDisk(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}
