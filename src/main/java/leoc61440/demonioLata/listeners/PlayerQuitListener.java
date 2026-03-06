import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        // Code to remove player from the game
        String playerName = event.getPlayer().getName();
        // Implement removal logic here
        System.out.println(playerName + " has left the game.");
    }
}