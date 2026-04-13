package com.mickey.entities;

import com.mickey.services.BookService;

import java.util.Scanner;

public class Student extends User{
    BookService bookService;
    public Student(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void showRole() {
        System.out.println("Student Role");
    }

    Scanner sc = new Scanner(System.in);

    public void issueBook(String bookName){
        bookService.borrowBook(bookName);
    }

    public void returnBook(String bookName){
        bookService.returnBook(bookName);
    }
}
