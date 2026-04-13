package com.mickey.services;

import com.mickey.entities.Book;

import java.util.ArrayList;

public class BookService {
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added");
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void borrowBook(String title) {
        Book foundBook = books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);

        if (foundBook == null) {
            System.out.println("Book not found");
            return;
        }

        if (foundBook.isIssued()) {
            System.out.println("Book already issued");
            return;
        }

        foundBook.setIssued(true);
        System.out.println("Book borrowed successfully");
    }

    public void returnBook(String title) {
        Book foundBook= books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
        if(foundBook==null){
            System.out.println("Book not found");
            return;
        }
        foundBook.setIssued(false);
        System.out.println("Book returned successfully");
    }
}
