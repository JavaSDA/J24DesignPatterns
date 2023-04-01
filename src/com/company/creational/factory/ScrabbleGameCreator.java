package com.company.creational.factory;

public class ScrabbleGameCreator implements GameFactory {
    public Game create() {
        return new BoardGame("Scrabble", "Family Game", 4);
    }
}
