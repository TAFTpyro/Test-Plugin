package me.pyro.plugin.commands;

import net.minecraft.server.v1_12_R1.CommandExecute;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.util.ArrayList;

public class Vanish extends CommandExecute implements Listener, CommandExecutor {

    String cmd1 = "vanish";
    private static ArrayList<Player> vanished = new ArrayList<Player>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(sender instanceof Player){
            Player player = (Player) sender;

            if(cmd.getName().equalsIgnoreCase(cmd1)) {
               if(!vanished.contains(player)){
                   vanished.add(player);
                   for (Player online : Bukkit.getOnlinePlayers()) {
                       online.hidePlayer(player);
                       return true;
                   }
               }else{
                   vanished.remove(player);
                   for (Player online : Bukkit.getOnlinePlayers()) {
                       online.showPlayer(player);
                       return true;
                   }
               }
            }
        }else{
            sender.sendMessage(ChatColor.YELLOW + "ERROR: " + ChatColor.RED + ChatColor.BOLD +"Only players can use this command!");
            return true;
        }
        return false;
    }
}
