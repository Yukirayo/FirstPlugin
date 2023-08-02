import Event.Blood;
import Event.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("Hello!");
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new ChatColor(),this);
        Bukkit.getPluginManager().registerEvents(new Blood(),this);
    }
}