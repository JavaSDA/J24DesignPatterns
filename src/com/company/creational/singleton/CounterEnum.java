package com.company.creational.singleton;

public enum CounterEnum {
    INSTANCE;

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }
}
