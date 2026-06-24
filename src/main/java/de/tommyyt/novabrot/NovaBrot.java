package de.tommyyt.novabrot;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class NovaBrot extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("NovaBrot aktiviert!");
    }

    @Override
    public void onDisable() {
        getLogger().info("NovaBrot deaktiviert!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player player)) {
            sender.sendMessage("Nur Spieler können diesen Befehl nutzen.");
            return true;
        }

        if (command.getName().equalsIgnoreCase("bread")) {
            ItemStack bread = new ItemStack(Material.BREAD, 64);
            player.getInventory().addItem(bread);
            player.sendMessage("§aDu hast 64 Brot erhalten!");
            return true;
        }

        return false;
    }
}
