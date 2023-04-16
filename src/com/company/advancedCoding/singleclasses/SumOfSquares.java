package com.company.advancedCoding.singleclasses;

import java.util.stream.IntStream;

public class SumOfSquares {
    public static void main(String[] args) {
        int sum = IntStream
                .rangeClosed(1, 20)
                .map(x -> x * x)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
