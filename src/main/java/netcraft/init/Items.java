package netcraft.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.ForgeRegistry;
import netcraft.items.CircuitBoard;
import netcraft.items.CopperIngot;
import netcraft.items.Cuprit;
import netcraft.items.CupritDust;
import netcraft.util.Reference;

import java.util.ArrayList;
import java.util.List;

public class Items {

    //Cuprit
    public static Item cuprit;
    public static Item cupritDust;
    //Copper
    public static Item copperIngot;
    public static Item circuitBoard;

    public static void init(){

        //Cuprit
        cuprit = new Cuprit();
        cupritDust = new CupritDust();
        //Copper
        copperIngot = new CopperIngot();
        circuitBoard = new CircuitBoard();
    }

    public static void register(){

        //Cuprit
        registerItem(cuprit);
        registerItem(cupritDust);
        //Copper
        registerItem(copperIngot);
        registerItem(circuitBoard);
    }

    private static void registerItem(Item item){
        ForgeRegistries.ITEMS.register(item);
        ModelLoader.setCustomModelResourceLocation(
                item, 0 , new ModelResourceLocation(item.getRegistryName(), "inventory")
        );
    }

}
