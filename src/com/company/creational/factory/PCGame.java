package com.company.creational.factory;

public class PCGame implements Game {
    private String name;
    private String type;
    private int minNumOfPlayers;
    private int maxNumOfPlayers;
    private boolean isOnline;

    public PCGame(String name, String type, int minNumOfPlayers, int maxNumOfPlayers, boolean isOnline) {
        this.name = name;
        this.type = type;
        this.minNumOfPlayers = minNumOfPlayers;
        this.maxNumOfPlayers = maxNumOfPlayers;
        this.isOnline = isOnline;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getMinNumOfPlayers() {
        return minNumOfPlayers;
    }

    public int getMaxNumOfPlayers() {
        return maxNumOfPlayers;
    }

    public boolean canBePlayedRemotely() {
        return isOnline;
    }

    @Override
    public String toString() {
        return "PCGame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", minNumOfPlayers=" + minNumOfPlayers +
                ", maxNumOfPlayers=" + maxNumOfPlayers +
                ", isOnline=" + isOnline +
                '}';
    }
}
