package com.company.creational.singleton.exercises;

public class Computer {
    private static Computer instance;

    private boolean startUp;

    private Computer() {
        startUp = false;
    }

    public void turnOnComputer() {
        startUp = true;
    }

    public boolean getComputerState() {
        return startUp;
    }

    public static Computer getInstance() {
        if (instance == null) {
            synchronized (Computer.class) {
                if (instance == null) instance = new Computer();
            }
        }
        return instance;
    }
}
