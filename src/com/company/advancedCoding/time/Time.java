package com.company.advancedCoding.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }
    }

    public Time add(Time other) {
        int totalSeconds = this.hour * 3600 + this.minute * 60 + this.second +
                other.hour * 3600 + other.minute * 60 + other.second;
        int newHour = totalSeconds / 3600 % 24;
        int newMinute = totalSeconds % 3600 / 60;
        int newSecond = totalSeconds % 60;
        return new Time(newHour, newMinute, newSecond);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
