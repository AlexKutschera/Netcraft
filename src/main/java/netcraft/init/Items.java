package netcraft.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.ForgeRegistry;
import netcraft.items.*;
import netcraft.util.Reference;

import java.util.ArrayList;
import java.util.List;

public class Items {

    //Stoffe
    public static Item cuprit;
    public static Item cupritDust;
    public static Item copperIngot;
    //Items
    public static Item circuitBoard;
    public static Item silicium;

    public static void init(){

        //Stoffe
        cuprit = new Cuprit();
        cupritDust = new CupritDust();
        copperIngot = new CopperIngot();
        //Items
        circuitBoard = new CircuitBoard();
        silicium = new Silicium();
    }

    public static void register(){

        //Stoffe
        registerItem(cuprit);
        registerItem(cupritDust);
        registerItem(copperIngot);
        //Items
        registerItem(circuitBoard);
        registerItem(silicium);
    }

    private static void registerItem(Item item){
        ForgeRegistries.ITEMS.register(item);
        ModelLoader.setCustomModelResourceLocation(
                item, 0 , new ModelResourceLocation(item.getRegistryName(), "inventory")
        );
    }

}
