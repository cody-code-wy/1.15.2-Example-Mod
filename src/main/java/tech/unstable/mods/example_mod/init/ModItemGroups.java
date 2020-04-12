package tech.unstable.mods.example_mod.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import tech.unstable.mods.example_mod.ExampleMod;

import java.util.function.Supplier;

public class ModItemGroups {
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(ExampleMod.MODID, () -> new ItemStack(ModItems.EXAMPLE_ITEM.get()));
    private static class ModItemGroup extends ItemGroup {

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String label, final Supplier<ItemStack> iconSupplier) {
           super(label);
           this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }
}
