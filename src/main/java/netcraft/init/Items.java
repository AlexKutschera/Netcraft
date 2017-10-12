package netcraft.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.ForgeRegistry;
import netcraft.items.Cuprit;
import netcraft.util.Reference;

import java.util.ArrayList;
import java.util.List;

public class Items {

    public static Item cuprit;

    public static void init(){
        cuprit = new Cuprit();
    }

    public static void register(){
        registerItem(cuprit);
    }

    private static void registerItem(Item item){
        ForgeRegistries.ITEMS.register(item);
        ModelLoader.setCustomModelResourceLocation(
                item, 0 , new ModelResourceLocation(item.getRegistryName(), "inventory")
        );
    }

}
