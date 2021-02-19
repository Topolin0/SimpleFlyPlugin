package plugintest;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command infoserver, String s, String[] strings) {

        if(sender instanceof ConsoleCommandSender || sender instanceof Player) {

            if(infoserver.getName().equalsIgnoreCase("fly")) {
                if(sender instanceof Player) {
                    if(sender.hasPermission("<WRITE HERE YOUR PERMISSION>")) {
                        Player p = (Player) sender;
                        if (p.getAllowFlight()) {
                            p.setAllowFlight(false);
                            sender.sendMessage("" + ChatColor.AQUA + "Fly disabilitata.");
                        } else {
                            p.setAllowFlight(true);
                            sender.sendMessage("" + ChatColor.AQUA + "Fly abilitata.");
                        }
                        return true;
                    }else {
                        sender.sendMessage("" + ChatColor.AQUA + "Non hai il permesso per eseguire questo comando!");
                    }
                } else {
                    System.out.println("Non puoi eseguire questo comando da console!");
                    return true;
                }
            }

        }

        return false;
    }
}
