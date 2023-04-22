package com.company.advancedCoding.time;

public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time(12, 30, 45);
        Time time2 = new Time(1, 15, 20);
        Time time3 = time1.add(time2);
        System.out.println(time1); // Output: 12:30:45
        System.out.println(time2); // Output: 01:15:20
        System.out.println(time3); // Output: 13:46:05
    }
}
