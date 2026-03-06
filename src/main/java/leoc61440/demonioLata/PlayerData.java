package leoc61440.demonioLata;

public class PlayerData {
    private Player player;
    private boolean isDemon;
    private boolean isCaptured;
    private long lastKickTimestamp;

    public PlayerData(Player player, boolean isDemon, boolean isCaptured, long lastKickTimestamp) {
        this.player = player;
        this.isDemon = isDemon;
        this.isCaptured = isCaptured;
        this.lastKickTimestamp = lastKickTimestamp;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean isDemon() {
        return isDemon;
    }

    public void setDemon(boolean demon) {
        isDemon = demon;
    }

    public boolean isCaptured() {
        return isCaptured;
    }

    public void setCaptured(boolean captured) {
        isCaptured = captured;
    }

    public long getLastKickTimestamp() {
        return lastKickTimestamp;
    }

    public void setLastKickTimestamp(long lastKickTimestamp) {
        this.lastKickTimestamp = lastKickTimestamp;
    }
}