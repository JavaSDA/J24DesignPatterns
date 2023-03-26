package com.company;

import com.company.creational.singleton.Counter;
import com.company.creational.singleton.CounterEnum;
import com.company.creational.singleton.Database;

public class Main {

    public static void main(String[] args) {

/*      Class based eager singleton */
  /*
        Counter foodCounter = Counter.getInstance();
        foodCounter.increment();
        foodCounter.increment();

        Counter carCounter = Counter.getInstance();
        System.out.println(carCounter.getCount());*/

        /* Enum based eager singleton */
/*        CounterEnum counter = CounterEnum.INSTANCE;
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        CounterEnum fishCounter = CounterEnum.INSTANCE;
        System.out.println(fishCounter.getCount());*/

        Database farmDb = Database.getInstance();
        farmDb.addNumber(1);
        farmDb.addNumber(2);
        farmDb.addNumber(3);

        Database poultryDb = Database.getInstance();
        System.out.println(poultryDb.getNumbers());
    }
}
