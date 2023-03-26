package com.company.creational.singleton;

public class Counter {
    private static final Counter INSTANCE = new Counter();
    private int count = 0;

    // By doing this, you prevent classes outside from being able
    // to create their own instances of this class.
    private Counter() {}

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    // getter for the singleton
    public static Counter getInstance() {
        return INSTANCE;
    }
}
