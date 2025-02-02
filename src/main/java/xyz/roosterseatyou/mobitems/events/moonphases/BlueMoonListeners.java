package xyz.roosterseatyou.mobitems.events.moonphases;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import xyz.roosterseatyou.mobitems.MobItems;
import xyz.roosterseatyou.mobitems.events.custom.MoonPhaseChangeEvent;
import xyz.roosterseatyou.mobitems.moonphases.BlueMoon;
import xyz.roosterseatyou.mobitems.utils.MathUtils;
import xyz.roosterseatyou.mobitems.utils.mobarmorutils.ListContainers;

public class BlueMoonListeners implements Listener {

    @EventHandler
    public void onMoonChange(MoonPhaseChangeEvent e) {
        FileConfiguration config = MobItems.getInstance().getConfig();
        if (e.getPhase() instanceof BlueMoon) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 12000, config.getInt("speed-level-blue")-1));
                p.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, 12000, config.getInt("luck-level-blue")-1));
                p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 12000, config.getInt("strength-level-blue")-1));
                p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 12000, config.getInt("resistance-level-blue")-1));
            }
        }
    }

    @EventHandler
    public void onDeath(EntityDeathEvent e){
        FileConfiguration config = MobItems.getInstance().getConfig();
        if(BlueMoon.isServerActive() && config.getBoolean("mobs-drop-items-blue")) {
            if(MathUtils.rngHelper(config.getInt("mobs-drop-items-chance-blue"))) {
                try{
                    e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), ListContainers.genRandItemFromEntity(e.getEntityType()));
                }catch (NullPointerException err){

                }
            }
        }
    }
}
