package me.pyro.plugin.events;

import me.pyro.plugin.Pizza;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class EventMove implements Listener {

    Pizza pizza = Pizza.getPlugin(Pizza.class );

    @EventHandler
    public void onPlace(BlockPlaceEvent event){
        Block block = event.getBlock();
        Player player = event.getPlayer();

        Location b_loc = block.getLocation();

        player.sendMessage("You placed block: "+ block.getType().toString() );
    }
}
