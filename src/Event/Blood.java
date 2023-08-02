package Event;

import org.bukkit.Server;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.server.BroadcastMessageEvent;

public class Blood implements Listener {
    @EventHandler
    public void onBlood(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player) {
                ((Player) e.getDamager()).sendRawMessage("§e[Blood] §3你攻击的" + e.getEntity().getName() + "剩余" + Math.max((((int) ((Damageable) e.getEntity()).getHealth()) - ((int) e.getDamage())),0) + "血！你造成了" + ((int) e.getDamage()) + "点伤害！");

            }


    }

}