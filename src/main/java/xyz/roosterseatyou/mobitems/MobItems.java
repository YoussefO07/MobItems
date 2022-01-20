package xyz.roosterseatyou.mobitems;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.roosterseatyou.mobitems.commands.MoonStatus;
import xyz.roosterseatyou.mobitems.commands.SetMoon;
import xyz.roosterseatyou.mobitems.commands.TestMode;
import xyz.roosterseatyou.mobitems.events.farmanimalevents.FarmAnimalEvents;
import xyz.roosterseatyou.mobitems.events.farmanimalevents.chicken.ChickenListeners;
import xyz.roosterseatyou.mobitems.events.farmanimalevents.cow.CowListeners;
import xyz.roosterseatyou.mobitems.events.farmanimalevents.sheep.SheepListeners;
import xyz.roosterseatyou.mobitems.events.moonphases.BloodMoonListeners;
import xyz.roosterseatyou.mobitems.events.moonphases.GoldenMoonListeners;
import xyz.roosterseatyou.mobitems.events.moonphases.MoonAnnouncer;
import xyz.roosterseatyou.mobitems.events.moonphases.MoonStarter;
import xyz.roosterseatyou.mobitems.events.undeadevents.UndeadEvents;
import xyz.roosterseatyou.mobitems.events.undetermined.RabbitListeners;
import xyz.roosterseatyou.mobitems.itemstacks.farmanimal.chicken.ChickenBeak;
import xyz.roosterseatyou.mobitems.itemstacks.farmanimal.chicken.ChickenFeet;
import xyz.roosterseatyou.mobitems.itemstacks.farmanimal.chicken.ChickenThighs;
import xyz.roosterseatyou.mobitems.itemstacks.farmanimal.chicken.ChickenWings;
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
import xyz.roosterseatyou.mobitems.itemstacks.undetermined.rabbit.*;

public final class MobItems extends JavaPlugin {

    @Override
    public void onEnable() {
        items();
        new UndeadEvents(this);
        new CowListeners(this);
        UndeadEvents.playerBurn();
        MoonStarter.moonStarter(this);
        getServer().getPluginManager().registerEvents(new GoldenMoonListeners(), this);
        getServer().getPluginManager().registerEvents(new BloodMoonListeners(), this);
        getServer().getPluginManager().registerEvents(new MoonAnnouncer(), this);
        getServer().getPluginManager().registerEvents(new RabbitListeners(), this);
        getServer().getPluginManager().registerEvents(new CowListeners(this), this);
        getServer().getPluginManager().registerEvents(new SheepListeners(), this);
        getServer().getPluginManager().registerEvents(new FarmAnimalEvents(), this);
        getServer().getPluginManager().registerEvents(new ChickenListeners(), this);
        this.getCommand("moonstatus").setExecutor(new MoonStatus());
        this.getCommand("setmoon").setExecutor(new SetMoon());
        this.getCommand("testmode").setExecutor(new TestMode());
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
        RabbitChest.init();
        RabbitLegs.init();
        RabbitFeet.init();
        KillerRabbitMask.init();
        KillerRabbitChest.init();
        KillerRabbitLegs.init();
        KillerRabbitFeet.init();
        ChickenBeak.init();
        ChickenWings.init();
        ChickenThighs.init();
        ChickenFeet.init();
    }
}