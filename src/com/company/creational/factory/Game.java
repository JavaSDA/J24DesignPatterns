package com.company.creational.factory;

public interface Game {
    String getName();
    String getType();
    int getMinNumOfPlayers();
    int getMaxNumOfPlayers();
    boolean canBePlayedRemotely();
}
