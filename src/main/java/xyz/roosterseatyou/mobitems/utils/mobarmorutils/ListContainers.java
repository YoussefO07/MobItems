package xyz.roosterseatyou.mobitems.utils.mobarmorutils;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import xyz.roosterseatyou.mobitems.itemstacks.undead.drowned.DrownedChest;
import xyz.roosterseatyou.mobitems.itemstacks.undead.drowned.DrownedFeet;
import xyz.roosterseatyou.mobitems.itemstacks.undead.drowned.DrownedLegs;
import xyz.roosterseatyou.mobitems.itemstacks.undead.drowned.DrownedMask;
import xyz.roosterseatyou.mobitems.itemstacks.undead.zombie.ZombieChest;
import xyz.roosterseatyou.mobitems.itemstacks.undead.zombie.ZombieFeet;
import xyz.roosterseatyou.mobitems.itemstacks.undead.zombie.ZombieLegs;
import xyz.roosterseatyou.mobitems.itemstacks.undead.zombie.ZombieMask;
import xyz.roosterseatyou.mobitems.utils.ItemUtils;
import xyz.roosterseatyou.mobitems.utils.MathUtils;

import java.util.ArrayList;
import java.util.List;

public class ListContainers {
    public static ItemStack getRandZombieArmor(){
        List<ItemStack> itemsList = new ArrayList<>();
        itemsList.add(ZombieMask.ZOMBIE_MASK);
        itemsList.add(ZombieChest.ZOMBIE_CHEST);
        itemsList.add(ZombieLegs.ZOMBIE_LEGS);
        itemsList.add(ZombieFeet.ZOMBIE_FEET);
        return ItemUtils.randomItemStackFromList(itemsList);
    }
    
    public static ItemStack genDungeonArmor(){
        List<ItemStack> itemsList = new ArrayList<>();
        itemsList.add(ZombieMask.ZOMBIE_MASK);
        itemsList.add(ZombieChest.ZOMBIE_CHEST);
        itemsList.add(ZombieLegs.ZOMBIE_LEGS);
        itemsList.add(ZombieFeet.ZOMBIE_FEET);
        return ItemUtils.randomItemStackFromList(itemsList);
    }

    public static ItemStack genUndead(){
        List<ItemStack> itemsList = new ArrayList<>();
        itemsList.add(ZombieMask.ZOMBIE_MASK);
        itemsList.add(ZombieChest.ZOMBIE_CHEST);
        itemsList.add(ZombieLegs.ZOMBIE_LEGS);
        itemsList.add(ZombieFeet.ZOMBIE_FEET);
        return ItemUtils.randomItemStackFromList(itemsList);
    }

    public static ItemStack genVillager(){
        return null;
    }

    public static ItemStack genMineshaft(){
        List<ItemStack> itemsList = new ArrayList<>();
        itemsList.add(ZombieMask.ZOMBIE_MASK);
        itemsList.add(ZombieChest.ZOMBIE_CHEST);
        itemsList.add(ZombieLegs.ZOMBIE_LEGS);
        itemsList.add(ZombieFeet.ZOMBIE_FEET);
        return ItemUtils.randomItemStackFromList(itemsList);
    }

    public static EntityType getRandEntity(){
        EntityType[] entityTypes = {EntityType.CREEPER, EntityType.HUSK, EntityType.SPIDER, EntityType.SKELETON, EntityType.STRAY, EntityType.ZOMBIE};
        int to = entityTypes.length - 1;
        return entityTypes[MathUtils.randomIntegerFromRange(0, to)];
    }

    public static ItemStack getRandAquatic(){
        List<ItemStack> itemStacks = new ArrayList<>();
        itemStacks.add(DrownedMask.DROWNED_MASK);
        itemStacks.add(DrownedChest.DROWNED_CHEST);
        itemStacks.add(DrownedLegs.DROWNED_LEGS);
        itemStacks.add(DrownedFeet.DROWNED_FEET);
        return ItemUtils.randomItemStackFromList(itemStacks);
    }

    public static List<Material> bedsList(){
        List<Material> list = new ArrayList<>();
        list.add(Material.WHITE_BED);
        list.add(Material.BLACK_BED);
        list.add(Material.BROWN_BED);
        list.add(Material.GRAY_BED);
        list.add(Material.RED_BED);
        list.add(Material.PINK_BED);
        list.add(Material.ORANGE_BED);
        list.add(Material.YELLOW_BED);
        list.add(Material.GREEN_BED);
        list.add(Material.LIME_BED);
        list.add(Material.CYAN_BED);
        list.add(Material.BLUE_BED);
        list.add(Material.PURPLE_BED);
        list.add(Material.MAGENTA_BED);
        return list;
    }
}
