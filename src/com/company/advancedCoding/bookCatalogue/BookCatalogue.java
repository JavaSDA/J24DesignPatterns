package com.company.advancedCoding.bookCatalogue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookCatalogue {
    private List<Book> books;

    public BookCatalogue() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book... books) {
        this.books.addAll(Arrays.asList(books));
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public List<Book> searchBooksByAuthor(String author) {
        // Create a list to hold results
        // loop through the list to find the matching books
        // return the result list
        return books
                .stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<Book> searchBooksByTitle(String title) {
        return books
                .stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    public double getTotalPrice() {
        return books
                .stream()
                .mapToDouble(Book::getPrice)
                .sum();
    }
}
