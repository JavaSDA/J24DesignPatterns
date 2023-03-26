package com.company.creational.singleton;

import java.util.ArrayList;
import java.util.List;

// Lazy Singleton
// This type of singleton is created when it is first called,
// afterwards the same singleton is used for the rest of the
// application lifetime.
public class Database {
    private static Database instance;

    private List<Integer> numbers = new ArrayList<>();

    private Database() {

    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    // Lazy Singleton
  /*  public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }*/

    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) instance = new Database();
            }
        }
        return instance;
    }
}
