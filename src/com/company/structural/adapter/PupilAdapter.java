package com.company.structural.adapter;

import java.util.Collection;

public class PupilAdapter implements Student {
    private Pupil pupil;

    public PupilAdapter(Pupil pupil) {
        this.pupil = pupil;
    }

    public String getFullName() {
        return pupil.getFirstName() + " " + pupil.getLastName();
    }

    public String getContactDetails() {
        return pupil.getEmail();
    }

    public boolean isAdult() {
        return pupil.getAge() >= 18;
    }

    public Collection<Integer> getResults() {
        return pupil.getGrades();
    }
}
