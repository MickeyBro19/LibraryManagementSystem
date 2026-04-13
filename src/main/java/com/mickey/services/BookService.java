package com.mickey.services;

import com.mickey.entities.Book;
import com.mickey.entities.Student;

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

    public Book findBook(String title) {
        Book foundBook= books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
        if(foundBook==null) {
            System.out.println("Book not found");
            return null;
        }
        return foundBook;

    }

    public void borrowBook(String title, Student student) {

        Book book = findBook(title);
        if (book == null) return;

        if (student.getBorrowedBooks().size() >= 2) {
            System.out.println("Limit reached");
            return;
        }

        if (book.isIssued()) {
            System.out.println("Already issued");
            return;
        }

        book.setIssued(true);
        book.setIssuedToStudentId(student.getId());

        student.getBorrowedBooks().add(book);

        System.out.println("Book issued successfully");
    }

    public void returnBook(String title, Student student) {

        Book book = findBook(title);
        if (book == null) return;

        if (book.getIssuedToStudentId() != student.getId()) {
            System.out.println("You didn't borrow this book");
            return;
        }

        book.setIssued(false);
        book.setIssuedToStudentId(-1);

        student.getBorrowedBooks().removeIf(b -> b.getId() == book.getId());

        System.out.println("Book returned successfully");
    }
}
