package com.company.creational.factory;

import java.util.Scanner;

public class FactoryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the game you want to create: ");
        String gameType = scanner.nextLine();

        GameFactory gameFactory;
        if (gameType.equals("PC")) {
            gameFactory = new HaloGameCreator();
        } else if (gameType.equals("Board")) {
            gameFactory = new ScrabbleGameCreator();
        } else {
            throw new RuntimeException("Unknown game type selection");
        }

        Game createdGame = gameFactory.create();
        System.out.println("Created game: " + createdGame);
    }
}
