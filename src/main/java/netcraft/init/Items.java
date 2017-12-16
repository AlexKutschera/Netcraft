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

    //Festplatten und Speicher
    public static Item firstdisk;
    public static Item seconddisk;
    public static Item thirddisk;
    public static Item fourthdisk;
    public static Item fifthdisk;
    public static Item sixthdisk;

    public static Item firstdiskmodule;
    public static Item seconddiskmodule;
    public static Item thirddiskmodule;
    public static Item fourthdiskmodule;
    public static Item fifthdiskmodule;
    public static Item sixthdiskmodule;

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

        //Festplatten und Speicher
        firstdisk = new FirstDisk();
        seconddisk = new SecondDisk();
        thirddisk = new ThirdDisk();
        fourthdisk = new FourthDisk();
        fifthdisk = new FifthDisk();
        sixthdisk = new SixthDisk();

        firstdiskmodule = new FirstDiskModule();
        seconddiskmodule = new SecondDiskModule();
        thirddiskmodule = new ThirdDiskModule();
        fourthdiskmodule = new FourthDiskModule();
        fifthdiskmodule = new FifthDiskModule();
        sixthdiskmodule = new SixthDiskModule();

        //Solarmodule
        solarmodulcopper = new SolarmodulCopper();
        solarmoduliron = new SolarmodulIron();
        solarmodulgold = new SolarmodulGold();
        solarmoduldiamant = new SolarmodulDiamant();
        solarmodulcuprit = new SolarmodulCuprit();
    }

    public static void register(){
        //Items
        registerItem(circuitBoard);
        registerItem(silicium);
        //Festplatten und Speicher
        registerItem(firstdisk);
        registerItem(seconddisk);
        registerItem(thirddisk);
        registerItem(fourthdisk);
        registerItem(fifthdisk);
        registerItem(sixthdisk);

        registerItem(firstdiskmodule);
        registerItem(seconddiskmodule);
        registerItem(thirddiskmodule);
        registerItem(fourthdiskmodule);
        registerItem(fifthdiskmodule);
        registerItem(sixthdiskmodule);
        //Solarmodule
        registerItem(solarmodulcopper);
        registerItem(solarmoduliron);
        registerItem(solarmodulgold);
        registerItem(solarmoduldiamant);
        registerItem(solarmodulcuprit);
    }

    /**
     * registers item in game registry
     * @param item item to register
     */
    public static void registerItem(Item item){
        ForgeRegistries.ITEMS.register(item);
        ModelLoader.setCustomModelResourceLocation(
                item, 0 , new ModelResourceLocation(item.getRegistryName(), "inventory")
        );
    }

}
