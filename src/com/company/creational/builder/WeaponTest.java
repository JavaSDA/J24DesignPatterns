package com.company.creational.builder;

import java.util.Arrays;

public class WeaponTest {
    public static void main(String[] args) {
        Weapon ak = new Weapon("Gun", "AK-42", 400,  2000, Arrays.asList("Sniping vision", "one-shot kill"));
        Weapon pistol = new Weapon.Builder()
                .withName("Gunslinger")
                .withDurability(1200)
                .withPerks(Arrays.asList("Straight shots never miss"))
                .build();

    }
}
