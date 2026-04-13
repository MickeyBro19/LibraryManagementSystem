package com.mickey.entities;

import com.mickey.services.BookService;

import java.util.ArrayList;
import java.util.Scanner;

public class Librarian extends User{
    BookService bookService;
    Scanner sc=new Scanner(System.in);

    public Librarian(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void showRole() {
        System.out.println("Librarian Role");
    }


    public void addBook() {
        System.out.println("Enter Book Title to add");
        String title=sc.nextLine();
        bookService.addBook(new  Book(title));
    }

    public void getBooks() {
        ArrayList<Book> books=bookService.getBooks();
        if(!books.isEmpty()){
            for(Book book:books){
                System.out.println(book.toString());
            }
            return;
        }
        System.out.println("Book list empty");
    }
}
