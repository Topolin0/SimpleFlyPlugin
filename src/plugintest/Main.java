package plugintest;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.World;

public class Main extends JavaPlugin {

    public static Main plugin;

    public void onEnable() {
        plugin = this;

        getCommand("fly").setExecutor(new Command());
    }

    public void onDisable() {
        System.out.println("Il plugin SimpleFly è stato disattivato correttamente!");
    }

    public static Main getInstance() {
        return plugin;
    }
}
