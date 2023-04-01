package com.company.creational.factory;

public class BoardGame implements Game {
    private String name;
    private String type;
    private int maxPlayersNum;

    public BoardGame(String name, String type, int maxPlayersNum) {
        this.name = name;
        this.type = type;
        this.maxPlayersNum = maxPlayersNum;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getMinNumOfPlayers() {
        return 2;
    }

    public int getMaxNumOfPlayers() {
        return maxPlayersNum;
    }

    public boolean canBePlayedRemotely() {
        return false;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", maxPlayersNum=" + maxPlayersNum +
                '}';
    }
}
