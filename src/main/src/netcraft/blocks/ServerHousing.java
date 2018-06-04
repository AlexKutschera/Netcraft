package netcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import netcraft.Netcraft;
import netcraft.init.Blocks;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ServerHousing extends Block implements ITickable, ICapabilityProvider {

    public static final String name = "server";

    public ServerHousing() {
        super(Material.IRON);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
        Blocks.registerBlock(this);
    }

    @Override
    public void update() {
        System.out.println("Update");
    }

    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
        return false;
    }

    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        return null;
    }

}