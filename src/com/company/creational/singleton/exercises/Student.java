package com.company.creational.singleton.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private static Student instance;
    private final Set<String> STUDENTS_LIST;

    private Student() {
        this.STUDENTS_LIST = new LinkedHashSet<>();
    }


    private boolean checkStudent(String studentName) {
        for (String student : STUDENTS_LIST) {
            String[] words = student.split(" ");
            String actualName = words[1] + " " + words[2];

            if (studentName.equalsIgnoreCase(actualName)) {
                return true;
            }
        }
        return false;
    }

    public boolean addStudent(String studentName) {

        try {
            // senior Dwayne Johnson
            // junior Dwayne Johnson
//        String dwayne = "senior Dwayne Johnson";
            String[] words = studentName.split(" ");
            String actualName = words[1] + " " + words[2];

            System.out.println("Does student exist?: " + checkStudent(actualName));

            // If the student's name is prefixed with senior or junior then add them
            if ((studentName.startsWith("senior") || studentName.startsWith("junior")) && !checkStudent(actualName)) {
                return STUDENTS_LIST.add(studentName);
            }
            return false;
        } catch (Exception e) {
            System.out.println("Please enter a value with senior or junior before it.");
            return false;
        }
    }

    public List<String> getSeniors() {
        return STUDENTS_LIST.stream().filter(student -> student.startsWith("senior"))
                .collect(Collectors.toList());
    }

    public List<String> getJuniors() {
        return STUDENTS_LIST.stream().filter(student -> student.startsWith("junior"))
                .collect(Collectors.toList());
    }

    public static Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }
}
