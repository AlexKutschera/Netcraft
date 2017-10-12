package netcraft.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import netcraft.items.Cuprit;

import java.util.ArrayList;
import java.util.List;

public class Items {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item cuprit = new Cuprit();

}
