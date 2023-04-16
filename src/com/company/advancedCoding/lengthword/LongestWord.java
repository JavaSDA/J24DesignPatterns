package com.company.advancedCoding.lengthword;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        List<String> words = readWords();

        String longest = findLongest(words, word -> word.length());

        System.out.println("The longest word you entered is: " + longest);
    }

    private static List<String> readWords() {
        // Initialize the scanner
        Scanner scan = new Scanner(System.in);

        // Initialize a result list
        List<String> words = new ArrayList<>();

        // Prompt the user on how to operate the program
        System.out.println("Enter some words, (one per line, enter an empty line to stop): ");

        while(true) {
            String line = scan.nextLine();
            if (line.isEmpty()) break;

            words.add(line);
        }
        scan.close();
        return words;
    }

    // Generic method to find the longest word
    private static <T> T findLongest(List<T> list, LengthFunction<T> function) {
        // The T represent the type you are expecting

        // The placeholder for the (potential) longest object
        T longest = null;

        // The placeholder for the (potential) length of the above
        int maxLength = 0;

        // loop through the list to find the longest element
        for (T element : list) {
            int length = function.getLength(element);
            if (length > maxLength) {
                longest = element;
                maxLength = length;
            }
        }

        // return longest element
        return longest;
    }
}
