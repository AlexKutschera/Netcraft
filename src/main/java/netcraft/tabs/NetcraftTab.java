package netcraft.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import netcraft.init.Items;

public class NetcraftTab extends CreativeTabs {

    public static final String LABEL = "Netcraft";

    public NetcraftTab() {
        super(LABEL);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.cuprit);
    }
}
