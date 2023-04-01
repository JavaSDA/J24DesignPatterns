package com.company.structural.adapter;

import java.util.List;

public class Pupil {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private List<Integer> grades;

    public Pupil(String firstName, String lastName, String email, int age, List<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
