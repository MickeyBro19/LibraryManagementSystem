package com.mickey.entities;

import com.mickey.services.BookService;

import java.util.ArrayList;

public class Student extends User{
    private int id;
    private static int counter = 1;
    private ArrayList<Book> borrowedBooks=new  ArrayList<>();



    BookService bookService;
    public Student(BookService bookService) {
        this.bookService = bookService;
        this.id = counter++;
    }
    public int getId() {
        return id;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public void showRole() {
        System.out.println("Student Role");
    }


    public void issueBook(String bookName){
        bookService.borrowBook(bookName, this);
    }

    public void returnBook(String bookName){
        bookService.returnBook(bookName, this);
    }
}
