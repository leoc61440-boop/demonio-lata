package leoc61440.demonioLata.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class PatearLataCommand implements CommandExecutor {
    private final JavaPlugin plugin;
    private long cooldown = 0;
    private final long cooldownTime = 5000; // 5 seconds cooldown

    public PatearLataCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Check the game state before executing the command
        if (!isGameActive()) {
            sender.sendMessage("The game is not active.");
            return true;
        }

        // Check cooldown
        long currentTime = System.currentTimeMillis();
        if (currentTime < cooldown) {
            sender.sendMessage("Please wait before using this command again.");
            return true;
        }

        // Set the cooldown
        cooldown = currentTime + cooldownTime;

        // Execute the command logic
        sender.sendMessage("You have kicked the can!");
        // Additional command logic goes here

        // Example of running a task after a delay
        new BukkitRunnable() {
            @Override
            public void run() {
                // Task to run after delay
            }
        }.runTaskLater(plugin, 20L); // Runs after 20 ticks (1 second)

        return true;
    }

    private boolean isGameActive() {
        // Add logic to check if the game is active
        return true; // Placeholder return
    }
}