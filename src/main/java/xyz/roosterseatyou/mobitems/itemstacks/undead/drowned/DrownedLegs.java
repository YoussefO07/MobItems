package xyz.roosterseatyou.mobitems.itemstacks.undead.drowned;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class DrownedLegs {
    public static Component NAME = Component.text("Drowned Leggings").color(TextColor.fromHexString("#89E2C7"));
    public static ItemStack DROWNED_LEGS;

    public static ItemStack init(){
        drownedLegs();
        return null;
    }

    public static void drownedLegs(){
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        List<Component> lore = new ArrayList<>();
        meta.displayName(NAME);
        meta.setColor(Color.fromRGB(54, 89, 78));
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        lore.add(Component.text("Ironically, you now know how to swim..."));
        //see UndeadArmorUtils & UnderwaterArmorUtils
        lore.add(Component.text("ENTITY ID: Drowned").color(TextColor.fromHexString("#89E2C7")).decorate(TextDecoration.ITALIC));
        lore.add(Component.text("CLASS ID: UNDEAD").color(TextColor.fromHexString("#2d3233")).decorate(TextDecoration.ITALIC));
        lore.add(Component.text("CLASS ID: AQUATIC").color(TextColor.fromHexString("#92D2E2")).decorate(TextDecoration.ITALIC));
        meta.lore(lore);
        item.setItemMeta(meta);
        DROWNED_LEGS= item;
    }
}
