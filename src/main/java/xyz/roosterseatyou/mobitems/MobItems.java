package xyz.roosterseatyou.mobitems;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.roosterseatyou.mobitems.events.TestingListener;
import xyz.roosterseatyou.mobitems.events.farmanimalevents.FarmAnimalEvents;
import xyz.roosterseatyou.mobitems.events.farmanimalevents.cow.CowListeners;
import xyz.roosterseatyou.mobitems.events.farmanimalevents.sheep.SheepListeners;
import xyz.roosterseatyou.mobitems.events.moonphases.MoonStarter;
import xyz.roosterseatyou.mobitems.events.undeadevents.UndeadEvents;
import xyz.roosterseatyou.mobitems.itemstacks.farmanimal.cow.CowChest;
import xyz.roosterseatyou.mobitems.itemstacks.farmanimal.cow.CowHooves;
import xyz.roosterseatyou.mobitems.itemstacks.farmanimal.cow.CowLegs;
import xyz.roosterseatyou.mobitems.itemstacks.farmanimal.cow.CowMask;
import xyz.roosterseatyou.mobitems.itemstacks.farmanimal.sheep.SheepChest;
import xyz.roosterseatyou.mobitems.itemstacks.farmanimal.sheep.SheepHooves;
import xyz.roosterseatyou.mobitems.itemstacks.farmanimal.sheep.SheepLegs;
import xyz.roosterseatyou.mobitems.itemstacks.farmanimal.sheep.SheepMask;
import xyz.roosterseatyou.mobitems.itemstacks.undead.drowned.DrownedChest;
import xyz.roosterseatyou.mobitems.itemstacks.undead.drowned.DrownedFeet;
import xyz.roosterseatyou.mobitems.itemstacks.undead.drowned.DrownedLegs;
import xyz.roosterseatyou.mobitems.itemstacks.undead.drowned.DrownedMask;
import xyz.roosterseatyou.mobitems.itemstacks.undead.zombie.ZombieChest;
import xyz.roosterseatyou.mobitems.itemstacks.undead.zombie.ZombieFeet;
import xyz.roosterseatyou.mobitems.itemstacks.undead.zombie.ZombieLegs;
import xyz.roosterseatyou.mobitems.itemstacks.undead.zombie.ZombieMask;
import xyz.roosterseatyou.mobitems.itemstacks.undetermined.rabbit.RabbitMask;
import xyz.roosterseatyou.mobitems.moonphases.MoonPhase;

public final class MobItems extends JavaPlugin {

    @Override
    public void onEnable() {
        items();
        new UndeadEvents(this);
        new CowListeners(this);
        UndeadEvents.playerBurn();
        new MoonStarter(this);
        MoonStarter.moonStarter();
        getServer().getPluginManager().registerEvents(new SheepListeners(), this);
        getServer().getPluginManager().registerEvents(new FarmAnimalEvents(), this);
        getServer().getPluginManager().registerEvents(new TestingListener(), this);
        Bukkit.getConsoleSender().sendMessage("Good Job!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static void items(){
        //Hostiles
        ZombieMask.init();
        ZombieChest.init();
        ZombieLegs.init();
        ZombieFeet.init();
        DrownedMask.init();
        DrownedChest.init();
        DrownedLegs.init();
        DrownedFeet.init();

        //Passives, Neutrals
        SheepMask.init();
        SheepChest.init();
        SheepLegs.init();
        SheepHooves.init();
        CowMask.init();
        CowChest.init();
        CowLegs.init();
        CowHooves.init();
        RabbitMask.init();
    }
}
