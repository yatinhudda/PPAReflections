package org.example;

public class Game {

    private int gameId;
    private String gameName;
    private int version;

    public Game(int gameId, String gameName, int version){
        this.gameId = gameId;
        this.gameName = gameName;
        this.version = version;
    }
    public void setGameId(int gameId){
        this.gameId = gameId;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getGameId() {
        return gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public int getVersion() {
        return version;
    }
}
