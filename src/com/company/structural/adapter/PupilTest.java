package com.company.structural.adapter;

import java.util.Arrays;

public class PupilTest {
    public static void main(String[] args) {
        Pupil george = new Pupil("George", "Benson", "george@b.com", 23, Arrays.asList(100, 80, 50));

        Student georgeStudent = new PupilAdapter(george);

        System.out.println("Full name: " + georgeStudent.getFullName());
        System.out.println("Contact: " + georgeStudent.getContactDetails());
        System.out.println("Adult: " + georgeStudent.isAdult());
        System.out.println("Results: " + georgeStudent.getResults());
    }
}
