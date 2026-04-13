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

    public void issueBook(){
        System.out.println("Enter Book Title to issue");
        String title=sc.nextLine();
        bookService.borrowBook(title);
    }

    public void returnBook(){
        System.out.println("Enter Book Title to return");
        String title=sc.nextLine();
        bookService.returnBook(title);
    }
}
