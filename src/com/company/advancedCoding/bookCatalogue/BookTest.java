package com.company.advancedCoding.bookCatalogue;

public class BookTest {
    public static void main(String[] args) {
        String gameOfThrones = "Song of Ice and Fire";
        String author = "George Martin";

        String goals = "Goals";
        String goalsAuthor = "Brian Tracy";

        Book game = new Book(gameOfThrones, author, 400);
        Book goal = new Book(goals, goalsAuthor, 400);

        BookCatalogue thePen = new BookCatalogue();

        thePen.addBook(game, goal);
        System.out.println(thePen.searchBooksByAuthor(author));
        System.out.println(thePen.getTotalPrice());
    }
}
