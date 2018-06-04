package netcraft.util.handlers;

import net.minecraft.item.ItemStack;
import netcraft.init.Blocks;
import netcraft.init.Items;
import netcraft.util.FurnaceRecipe;

import java.util.ArrayList;
import java.util.List;

public class FurnaceRecipesHandler {

    private static List<FurnaceRecipe> recipes = new ArrayList<>();

    public static void init(){
        recipes.add(new FurnaceRecipe(new ItemStack(Blocks.copperOre, 1), new ItemStack(Items.copperIngot, 1), 0));
    }

    public static void register(){
        for (FurnaceRecipe recipe : recipes){
            recipe.register();
        }
    }

}
