public class SteamGame {
    private int gameid;
    private String name;
    private double playTime;
    private double timeToBeat;
    private int gameSizeInKB;

    public SteamGame() {}

    public SteamGame(
            int gameid,
            String name,
            double playTime,
            double timeToBeat,
            int gameSizeInKB ){
        this.gameid = gameid;
        this.name = name;
        this.playTime = playTime;
        this.timeToBeat = timeToBeat;
        this.gameSizeInKB = gameSizeInKB;
    }

    public int getGameid() {
        return gameid;
    }

    public void setGameid(int gameid) {
        this.gameid = gameid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPlayTime() {
        return playTime;
    }

    public void setPlayTime(double playTime) {
        this.playTime = playTime;
    }

    public double getTimeToBeat() {
        return timeToBeat;
    }

    public void setTimeToBeat(double timeToBeat) {
        this.timeToBeat = timeToBeat;
    }

    public int getGameSizeInKB() {
        return gameSizeInKB;
    }

    public void setGameSizeInKB(int gameSizeInKB) {
        this.gameSizeInKB = gameSizeInKB;
    }
}
