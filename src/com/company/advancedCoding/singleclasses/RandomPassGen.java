package com.company.advancedCoding.singleclasses;

import java.util.Random;
import java.util.Scanner;

public class RandomPassGen {
    // Declare a constant for the character ranges
    private static final String UPPER_CASE_CHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE_CHAR = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String ALL_CHARS = UPPER_CASE_CHAR + LOWER_CASE_CHAR + DIGITS;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What's the expected length of the password?: ");
//        int length = scan.nextInt();

//        String password = generatePassword(length);
        System.out.println("Your generated password is: " + generatePassword(scan.nextInt()));
    }

    private static String generatePassword(int length) {
        Random rand = new Random();

        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            // generate the random index within the bounds of
            // the ALL_CHARS string
            int randIndex = rand.nextInt(ALL_CHARS.length());

            // Extract the character using the random index we got
            char randomChar = ALL_CHARS.charAt(randIndex);

            // append the character to ghe password object
            password.append(randomChar);
        }
        return password.toString();
    }

}
