import org.bukkit.command.Command;  
import org.bukkit.command.CommandExecutor;  
import org.bukkit.command.CommandSender;  
import org.bukkit.plugin.java.JavaPlugin;  

public class DemonioCommand implements CommandExecutor {  
    private final JavaPlugin plugin;  

    public DemonioCommand(JavaPlugin plugin) {  
        this.plugin = plugin;  
        // Register command in plugin's onEnable  
        plugin.getCommand("demonio").setExecutor(this);  
    }  

    @Override  
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {  
        if (args.length == 0) {  
            return false;  
        }  

        switch (args[0].toLowerCase()) {  
            case "start":  
                // Handle start command  
                sender.sendMessage("Demonio started!");  
                return true;  
            case "stop":  
                // Handle stop command  
                sender.sendMessage("Demonio stopped!");  
                return true;  
            case "join":  
                // Handle join command  
                sender.sendMessage("Joined the demonio session!");  
                return true;  
            case "leave":  
                // Handle leave command  
                sender.sendMessage("Left the demonio session!");  
                return true;  
            case "status":  
                // Handle status command  
                sender.sendMessage("Demonio is currently running!");  
                return true;  
            default:  
                return false;  
        }  
    }  
}  
