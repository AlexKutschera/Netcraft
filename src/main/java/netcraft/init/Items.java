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
    //Festplatten
    public static Item firstdisk;
    public static Item seconddisk;
    public static Item thirddisk;
    public static Item fourthdisk;
    public static Item fifthdisk;
    public static Item sixthdisk;
    //Solarmodule
    public static Item solarmodulcopper;
    public static Item solarmoduliron;
    public static Item solarmodulgold;
    public static Item solarmoduldiamant;
    public static Item solarmodulcuprit;

    public static void init(){

        //Stoffe
        cuprit = new Cuprit();
        cupritDust = new CupritDust();
        copperIngot = new CopperIngot();
        //Items
        circuitBoard = new CircuitBoard();
        silicium = new Silicium();
        //Festplatten
        firstdisk = new FirstDisk();
        seconddisk = new SecondDisk();
        thirddisk = new ThirdDisk();
        fourthdisk = new FourthDisk();
        fifthdisk = new FifthDisk();
        sixthdisk = new SixthDisk();
        //Solarmodule
        solarmodulcopper = new SolarmodulCopper();
        solarmoduliron = new SolarmodulIron();
        solarmodulgold = new SolarmodulGold();
        solarmoduldiamant = new SolarmodulDiamant();
        solarmodulcuprit = new SolarmodulCuprit();
    }

    public static void register(){

        //Stoffe
        registerItem(cuprit);
        registerItem(cupritDust);
        registerItem(copperIngot);
        //Items
        registerItem(circuitBoard);
        registerItem(silicium);
        //Festplatten
        registerItem(firstdisk);
        registerItem(seconddisk);
        registerItem(thirddisk);
        registerItem(fourthdisk);
        registerItem(fifthdisk);
        registerItem(sixthdisk);
        //Solarmodule
        registerItem(solarmodulcopper);
        registerItem(solarmoduliron);
        registerItem(solarmodulgold);
        registerItem(solarmoduldiamant);
        registerItem(solarmodulcuprit);
    }

    private static void registerItem(Item item){
        ForgeRegistries.ITEMS.register(item);
        ModelLoader.setCustomModelResourceLocation(
                item, 0 , new ModelResourceLocation(item.getRegistryName(), "inventory")
        );
    }

}
