package Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatColor implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        String chatMessage = e.getMessage().replaceAll("&(?=[0-9a-erfm])","§");
        e.setMessage(chatMessage);
    }
}
