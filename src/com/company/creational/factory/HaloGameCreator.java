package com.company.creational.factory;

public class HaloGameCreator implements GameFactory {
    public Game create() {
        return new PCGame("Halo", "FPS", 1, 4, true);
    }
}
