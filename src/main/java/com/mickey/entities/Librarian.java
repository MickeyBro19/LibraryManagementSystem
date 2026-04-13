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


    public void addBook(String bookName) {
        bookService.addBook(new  Book(bookName));
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

    public void findBook(String bookName) {
        Book book=bookService.findBook(bookName);
        if(book!=null){
            System.out.println(book.toString());
            return;
        }
        System.out.println("Book not found");


    }
}
